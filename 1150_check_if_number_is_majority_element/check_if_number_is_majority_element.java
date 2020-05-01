class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        
        if(nums.length == 0) {
            return false;
        }
        
        int count = 0;
        int result = 0;
        int n  = nums.length;
        
        int last_index = (n%2==0)? n/2: n/2+1; 

        for(int i = 0; i < last_index; i++) {
            if(nums[i] == target && nums[i+n/2] == target) {
                return true;
            }
            
        }
        
        return false;
        

    }
}
