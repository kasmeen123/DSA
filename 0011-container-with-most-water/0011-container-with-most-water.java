class Solution {
    public int maxArea(int[] height) {
        
        // int n = height.length;
        // int maxWater = 0;
        // for(int i = 0; i < n; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         int currWater = Math.min(height[i], height[j])*(j-i);
        //         maxWater = Math.max(currWater, maxWater);
        //     }
        // }
        // return maxWater;
        
        int n = height.length;
        int maxWater = 0;
        int i = 0;
        int j = n-1;
        while(j > i) {
            if(height[i] >= height[j]){
                int currWater = Math.min(height[i], height[j])*(j-i);
                maxWater = Math.max(currWater, maxWater);
                j--;
            }
            else {
                int currWater = Math.min(height[i], height[j])*(j-i);
                maxWater = Math.max(currWater, maxWater);
                i++;
            
            }
        }
        return maxWater;
    }
}