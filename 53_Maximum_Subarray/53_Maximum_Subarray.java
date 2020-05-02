class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        if(nums.length < 2 ) {
            return nums[0];
        }
        
        int sum = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i],sum+nums[i]);    
            result = Math.max(sum,result);
        }
        
       
        return result;
        
    }
}
