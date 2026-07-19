class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Brute Force
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product =1 ;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product *= nums[j];
                }
            }
            result[i] = product;
        }

        return result;
      
        // int[] ans = new int[nums.length];
        // int leftProduct = 1;

        // for(int i=0;i<nums.length;i++){
        //     ans[i] = leftProduct;
        //     leftProduct *= nums[i];
        // }

        // int rightProduct = 1;

        // for(int i=nums.length-1;i>=0;i--){
        //     ans[i] *= rightProduct;
        //     rightProduct *= nums[i];
        // }

        // return ans;
    }
}
