class Solution {
    public int trap(int[] height) {
        
        int[] left = new int[height.length];//empty
        int[] right = new int[height.length];//empty

        int max = 0;
        //left-->right
        for(int i=0;i<height.length;i++){
            if(height[i]>=max){
                max = height[i];
            }
            left[i] = max;//4,4,4,4,4,5
        }

        max = 0;
        //right-->left
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=max){
                max = height[i];
            }
            right[i] = max;//5,5,5,5,5,5
        }

        int total = 0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(left[i],right[i])-height[i];
        }

        return total;
    }
}
