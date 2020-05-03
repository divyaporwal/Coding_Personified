class Solution {
    public boolean isValid(String s) {
        if(s == null) {
            return true;
        }
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            }
            
            if(c == '}' || c == ']' || c == ')') {
                if(st.empty()) {
                    return false;
                } else if(!match(st.pop(),c)) {
                        return false;
                }
            }
             
        }
        if (st.empty())
            return true;
        else 
            return false;
    }
    
    public boolean match(char c1, char c2) {
        if(c1 == '{' && c2 == '}') {
            return true;
        } else if(c1 == '[' && c2 == ']') {
            return true;
        } else if(c1 == '(' && c2 == ')') {
            return true;
        }
        return false;
    }
}
