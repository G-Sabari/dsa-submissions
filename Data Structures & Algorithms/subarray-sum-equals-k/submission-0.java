class Solution {
    public int subarraySum(int[] nums, int k) {

        for(int i=0;i<numss.length;i++){
            int sum = 0;
            for(int j=i;j<numd.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }   
        return count;
    }
}