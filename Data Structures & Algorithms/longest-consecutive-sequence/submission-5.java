class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }//{2,20,4,10,3,5} --> remove duplicates

        int count = 0;
        int maxCount = 0;

        for(int element : set){
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
