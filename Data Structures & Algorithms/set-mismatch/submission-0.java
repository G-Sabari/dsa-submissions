class Solution {
    public int[] findErrorNums(int[] nums) {
        //return duplicate and missing
        HashMap<Integer,Integer> map = new HashMap<>();

        int duplicate = 0, missing = 0;

        for(int num : nums){//O(n)
            map.put(num,map.getOrDefault(num,0)+1);//{1=1,2=2,4=1};
        }

        //check duplicate and mssing
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    duplicate = i;
                }
            }

            else{
                missing = i;
            }
        }

        int[] result = new int[2];//O(n)
        result[0] = duplicate;
        result[1] = missing;

        return result;
    }
}