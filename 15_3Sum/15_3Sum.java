class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) {
            return result;
        }
        
        Arrays.sort(nums);
        
        for(int i = 0;  i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            
            if(i > 0 && nums[i] == nums[i-1]) {
                
                continue;
            }
            while(j < k) {
                
                if(k < nums.length - 1 && nums[k] == nums[k+1]) {
                    k--;
                    continue;
                }
                if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else if(nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    ArrayList<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    result.add(res);
                    j++;
                    k--;
                }
            }
            
        }
        
        return result;
        
    }
}
