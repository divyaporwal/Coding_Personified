/**
// naive DP based search

O(n*n) time complexity
O(n) space complexity

class Solution {
    public int lengthOfLIS(int[] nums) {
        
        // base case handling. when the arr is null or empty.
        if(nums== null || nums.length == 0) {
            return 0;
        }
        
        // initially the LIS of every integer would be 1
        int[] max = new int[nums.length];
        
        // fill all the array indices values to be 1
        Arrays.fill(max,1);
        
        // initialize the result variable to be 1;
        int result = 1;
        
        // iterate through the array now .
        // if arr[j] < arr[i], then we add the LIS[i] = LIS[j] + 1.
        // if , arr[j] == arr[i], we increment the i and reset the value of j.
        // if arr[j] >= arr[i] , we increment j and do nothing.
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                // if nums[i] > nums[j], we take the max of the max[i] and max[j] + 1
                // and assign it to the max[i] array at index i.
                if(nums[i] > nums[j]) {
                    max[i] = Math.max(max[i],max[j] + 1);
                }
            }
            // take the max of the result or the max[i] and store it in result var
            result = Math.max(max[i],result);
        }
       // return the var result 
       return result;
        
    }
}

*/

class Solution {
    public int lengthOfLIS(int[] nums) {
        //base case handling
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : nums) {
            
            if(list.size() == 0 || num > list.get(list.size()-1)) {
                list.add(num);
            } else {
                // 
                
                int i = 0;
                int j = list.size()-1;
                
                
                while(i<j){
                    int mid = (i+j)/2;
                    if(list.get(mid) < num){
                        i=mid+1;
                    }else{
                        j=mid;
                    }
                }
                
                list.set(j, num);
 
            } 
            
          
            
        }
        
          return list.size();
    }
}









