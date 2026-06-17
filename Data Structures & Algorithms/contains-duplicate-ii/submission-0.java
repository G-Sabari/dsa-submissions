class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);//store = key:value
            }

            else{
                int prevIndex = map.get(nums[i]);
                if(i-prevIndex<=k){
                    return true;
                }
                map.put(nums[i],i);
            }
        }

        return false;
    }
}