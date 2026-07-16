class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        //count the old happy customers
        int count = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                count+=customers[i];
            }
        }

        int extra = 0;
        //first window
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }

        //sliding windoww
        int best = extra;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }

            if(grumpy[i]==1){
                extra+=customers[i];
            }

            best = Math.max(extra,best);
        }
        return best+count;
    }
}