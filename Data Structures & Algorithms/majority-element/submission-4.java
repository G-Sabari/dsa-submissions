class Solution {
    public int majorityElement(int[] nums) {
        //Optimal Solution - Using HashMap

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;

        //Brute-Force
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count = 1;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }

        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        // return -1;
    }
}