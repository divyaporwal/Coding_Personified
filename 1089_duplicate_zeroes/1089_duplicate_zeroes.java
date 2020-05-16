class Solution {
    public void duplicateZeros(int[] arr) {
        int possible_duplicates = 0;
        
        int l = arr.length - 1;
        
        for(int i = 0; i <= l-possible_duplicates; i++) {
           
            if(arr[i] == 0) {
                if(i == l - possible_duplicates) {
                    // if length is l - possible_duplicates, then we set the arr[l] = 0 as it
                    // will not have duplicates. also we decrement the length of the array by 1.
                    // and then break from the loop.
                    arr[l] = 0;
                    l = l - 1;
                    break;
                }
                possible_duplicates++;
            }
        }
        
            
        // start last from l - possible_duplicates.
        
        int last = l - possible_duplicates;
        
        for(int i = last; i >= 0; i--) {
            // if arr[i] is 0, then set the arr[i+possible_duplicates] to 0.
            // decrement the pointer and set again to 0.
            if(arr[i] == 0) {
                arr[i + possible_duplicates] = 0;
                possible_duplicates--;
                arr[i + possible_duplicates] = 0;
            } else {
                arr[i + possible_duplicates] = arr[i];
            }
        }
        
        
        
    }
}
