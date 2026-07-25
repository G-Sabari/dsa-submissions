class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;
        for(int num : nums){
            ans^=num;
        }
        return ans;
        
        // HashSet<Integer> set = new HashSet<>();

        // for(int num : nums){
        //     if(set.contains(num)){
        //         set.remove(num);
        //     } else{
        //         set.add(num);
        //     }
        // }

        // for(int n : set){
        //     return n;
        // }
        
        // return -1;
    }
}
