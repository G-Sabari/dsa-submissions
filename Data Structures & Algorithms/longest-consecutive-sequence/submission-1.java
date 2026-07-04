class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);//[2,20,4,10,3,5];
        }

        int count = 0;
        int maxCount = 0;

        for(int element : nums){
            if(!set.contains(element-1)){
                count = 1;
                int value = element;

                while(set.contains(value+1)){
                    count++;
                    value++;
                }

                maxCount = Math.max(count,maxCount);
            }
        }

        return maxCount;
    }
}
