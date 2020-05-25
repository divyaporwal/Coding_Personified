class Solution {
    public boolean isPalindrome(int x) {
        
        // using the concept that if we reverse the number and chec,
        // then we can check if its a palindrome or not.
        
        // negative numbers cannot be palindrome
        if(x < 0) {
            return false;
        }
        
        int div = 1;
        
        // check for the tens in the number.
        while(x/div >= 10) {
            div = div*10;
        }
        
        while(x!=0) {
            // check for the left values and the right values
            int left = x/div;
            int right = x%10;
            
            if(left != right) {
                return false;
            }
            
            x = (x%div)/10;
            div = div/100;
        }
        
        return true;
    }
}
