class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        //Time - O(n)
        //Space - O(n)
        /*A nested loop is not always O(n²).
        In this problem, the while loop does not restart 
        work for every element because numbers in the middle 
        of a sequence are skipped. Each number participates in 
        sequence counting at most once, keeping the total time O(n).*/
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }//[2,20,4,10,3,5]

        int count = 0;
        int maxCount = 0;
        for(int element : set){
            if(!set.contains(element-1)){
                count = 1;
                int value = element; //[100]
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
