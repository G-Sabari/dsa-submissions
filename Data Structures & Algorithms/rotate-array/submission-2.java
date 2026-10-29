class Solution {
    public void rotate(int[] nums, int k) {
        
        //edge case
        if(nums == null){
            return;
        }

        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);//rotate the whole array
        reverse(nums,0,k-1); // rotate the k elemtns 
        reverse(nums,k,n-1);//rotate the remaining element

    }

    private void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}