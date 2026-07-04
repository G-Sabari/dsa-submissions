class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int answer = 0;

        while(left<right){
            int capacity = Math.min(heights[left],heights[right])*(right - left);

            answer = Math.max(answer,capacity);

            if(heights[left]<heights[right]){
                left++;
            } else{
                right--;
            }
        }

        return answer;
    }
}
