class Solution {
    public int findLucky(int[] arr) {
        //Time - O(N) || Space - O(N)
        //Using HashMap;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int ans = -1;
        for(int num : arr){
            int freq = map.get(num);
            if(freq==num){
                if(ans<num){
                    ans = num;
                }
            }
        }

        return ans;
        
        
        //Optimal one

        // int[] freq = new int[501];
        // int ans = -1;
        // for(int num : arr){
        //     freq[num]++;
        // }

        // for(int i=1;i<=500;i++){
        //     if(freq[i]==i){
        //         ans = i;
        //     }
        // }

        // return ans;
    }
}