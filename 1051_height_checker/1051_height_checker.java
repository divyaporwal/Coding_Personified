class Solution {
    public int heightChecker(int[] heights) {
        if(heights.length < 2) {
            return 0;
        }
    
        
        int[] clone_height = heights.clone();
        
        Arrays.sort(heights);
        
        int count = 0;
        
        for(int i = 0; i < heights.length; i++) {
            if(clone_height[i] != heights[i]) {
                count++;
            }
        }
        
        return count;
        
        
        
    }
}
