class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        // declare one empyt list of list
        List<List<Integer>> result = new ArrayList<>();
        
        generate_permutations(result,nums,0);
        
        return result;
    }
    
    public void generate_permutations(List<List<Integer>> result, int[] nums, int start) {
        
        // if the value of start becomes equal to the length of the nums array, we add the 
        if(start == nums.length-1) {
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 0; j < nums.length; j++) {
                al.add(nums[j]);
            }
            result.add(al);
            return;
        }
        
        for(int i = start; i < nums.length; i++) {
            swap(i,start,nums);
            generate_permutations(result,nums,start+1);
            swap(i,start,nums);   
        }
        
        
        
        
        
    }
    
    public void swap(int a , int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
