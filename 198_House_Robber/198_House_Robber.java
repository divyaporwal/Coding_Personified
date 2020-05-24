class Solution {
    public int rob(int[] nums) {
        
        // initialize two variables , prevMax and currMax
        int prevMax = 0;
        int currMax = 0;
        
        // loop for all the values and check
        // store the curreMax in some temporary variable.
        // find the maximum of the prevmax + curr value and currMax.
        // update the prevMax.
        for(int x : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        
        return currMax;
        
    }
}
