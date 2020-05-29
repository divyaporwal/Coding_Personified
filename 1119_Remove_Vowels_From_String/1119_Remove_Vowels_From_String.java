class Solution {
    public String removeVowels(String S) {
        
        // take an array of characs with vowels.
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
           
        // convert the arr to list of chars
        List<Character> al = Arrays.asList(vowels);
        
        // initialize new string buffer
         StringBuffer sb = new StringBuffer(S); 
        
        // loop to replace the elements in the buffer 
        // replace the vowels in the buffer with a blank
        for (int i = 0; i < sb.length(); i++) { 
            if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
             } 
        } 
          
        return sb.toString();

        
    }
};
