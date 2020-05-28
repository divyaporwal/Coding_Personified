class Solution {
    public String reverseVowels(String s) {
        
        ArrayList<Character> vowList = new ArrayList<Character>();
        vowList.add('a');
        vowList.add('e');
        vowList.add('i');
        vowList.add('o');
        vowList.add('u');
        
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = s.length()-1;
       
        while(left < right) {
            if(!vowList.contains(Character.toLowerCase(arr[left]))) {
                left++;
                continue;
            }
            
            if(!vowList.contains(Character.toLowerCase(arr[right]))) {
                right--;
                continue;
            }
            
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
            
        }
        
        return new String(arr);
        
    }
}
