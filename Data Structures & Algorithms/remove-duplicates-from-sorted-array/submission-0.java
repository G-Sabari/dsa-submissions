class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;//first value is always unique
        //[1,1,2,3,4]
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}