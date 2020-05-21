class Solution {
    public void moveZeroes(int[] nums) {
        
        int last_found = 0;
       
        // swap the nonzeroth element with the last occcurence of non zeroth element+1
        for(int curr = 0; curr < nums.length; curr++) {
            if(nums[curr] != 0) {
                swap(nums,curr,last_found);
                last_found++;
            }
        }
        
        
    }
    
    public void swap(int[] nums, int a , int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
