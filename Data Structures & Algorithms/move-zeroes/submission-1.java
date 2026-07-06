class Solution {
    public void moveZeroes(int[] nums) {
        
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }

        //fill the remaing places into zero
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}