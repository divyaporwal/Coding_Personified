/* 
Approach : 1 , 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Approach 1 : T.C. O(N)
        // S.C. O(N)
        
        int l = nums.length;
        
        int[] leftp = new int[l];
        int[] rightp = new int[l];
        
        
        int[] res = new int[l];
        
        leftp[0] = 1;
        rightp[l-1] = 1;
        
        for(int i = 1; i < l; i++) {
            leftp[i] = leftp[i-1]*nums[i-1];
            
        }
        
        for(int i = l-2; i >= 0; i--) {
            rightp[i] = rightp[i+1]*nums[i+1];
        }
        
        for(int i = 0; i < l; i++) {
            res[i] = leftp[i]*rightp[i];
        }
        
        return res;
    }
}
*/

// APPROACH 2
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // get the length of the input arr
        int l = nums.length;
        
        // result
        int[] res = new int[l];
        
        // res has product of all the elements to the left.
        // for the element at index 0, there are no elements to the left.
        // so the res[0] = 1
        
        res[0] = 1;
        
        for(int i = 1; i < l; i++) {
            // res[i-1] has products of elements to the left of i-1.
            // multiply it with nums[i-1] would give the product of all.
            
            // elements to the left of index i.
            
            res[i] = res[i-1] * nums[i-1];
            
        }
        
        // R pointer here will have the product of all the elements to the right.
        // for the element at index l-1, there are no elements to the right.
        
        
        int right = 1;
        
        for(int i = l-1; i >= 0; i--) {
            // for the index i, R would contain the product of all the elements to the right. We update R accordingly.
            
            res[i] = res[i]*right;
            right = right*nums[i];
        }
        
        return res;
    }
}
