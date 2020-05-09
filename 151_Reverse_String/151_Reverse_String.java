class Solution {
    public String reverseWords(String s) {
        if(s == null || s == "") {
            return s;
        }
        
        // using stringbuilder here. String are immutable and in order to make the things scalable 
        
        StringBuilder sb = new StringBuilder();
        
        String[] string_arr = s.split(" ");
        
        
        for(int i = string_arr.length-1; i >= 0; i--) {
            if(!string_arr[i].equals(""))
                sb.append(string_arr[i]).append(" ");
        }
        
        return (sb.length() == 0) ? "":sb.substring(0,sb.length()-1);
    }
}
