class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int s = 0;
        int e = nums.length-1;
        
        // find the first index scanning from left to right , 
        // where the element < next element.
        
        for(s = 0; s < nums.length-1; s++) {
            if(nums[s] > nums[s+1]) {
                break;
            }
           
        }
        
        // base case for the condition when array is sorted
        if(s == nums.length-1) {
            return 0;
        }
        
        
        // find the first element while scanning the array from right to left, where
        // first element < next element (in right to left order)
        
        for(e = nums.length-1; e > 0; e--) {
            if(nums[e] < nums[e-1]) {
                break;
            }
        }
        
        // find the min and max values in the array that we found from s.....e.
        // update the values to the min and max .
        
        int min = nums[s];
        int max = nums[s];
        
        
        for(int i = s+1; i <= e; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        
        
        
        // search the sub array 0....s-1, find the element which is > min, update the s to that elements index
        for(int i = 0; i < s; i++) {
            if(nums[i] > min) {
                s = i;
                break;
            }
        }
        
        // search the sub array e+1...0, find the last element which is < max, update the e to the indx of that element.
        for(int i = nums.length-1; i >= e+1; i--) {
            if(nums[i] < max) {
                e = i;
                break;
            }
        }
        
        return e - s + 1;
        
        
        
    }
}
