class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int count = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                count+=customers[i];
            }
        }
        //first window 
        int extra = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        int best = extra;
        //sliding window
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }

            if(grumpy[i]==1){
                extra+=customers[i];
            }
            best = Math.max(best,extra);
        }
        return best+count;

    }
}