class Solution {
    
    
    public int binarySearch(int[] arr, int low , int high , int x) {
        
        if(low <= high) {
            int mid = low + (high-low)/2;
            
            if ( (mid == 0 || x > arr[mid-1]) && (arr[mid] == x) ) 
                return mid; 
            else if (x > arr[mid]) 
                return binarySearch(arr, (mid + 1), high, x); 
            else
                return binarySearch(arr, low, (mid -1), x); 
        }
        
        return -1;
    }
    
    public boolean isMajorityElement(int[] nums, int target) {

        int n  = nums.length;
        
        int found = binarySearch(nums,0,n-1,target);
        
        
        if(found == -1) {
            return false;
        }
        
        if( (found + n/2 <= n-1) && nums[found+n/2] == nums[found]) {
                return true;
            }  else {
            return false;
        }
    //    return false;
    
    }
}
