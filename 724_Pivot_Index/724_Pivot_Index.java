class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length < 2) {
            return -1;
        }
        
        int sum = 0;
        int l_sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        
        for(int i = 0; i < nums.length; i++) {
            
            if(l_sum == sum - l_sum - nums[i]) {
                return i;
            }
            
            l_sum += nums[i];
        }
        return -1;
    }
}
