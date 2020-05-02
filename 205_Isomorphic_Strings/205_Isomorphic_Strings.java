class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null && t == null) {
            return true;
        } else if(s.length() != t.length()) {
            return false;
        } 
        
        //take one hashmap , where the key is the character of s at index i
        // value is the character of t at index i
        
        HashMap<Character,Character> h = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            
            if(h.containsKey(s.charAt(i))) {
                char key = h.get(s.charAt(i));
                if (key!= t.charAt(i))
                    return false;
            } else {
                h.put(s.charAt(i),t.charAt(i));
            }
            
        }
        
        //check if set size is equal to the values size
        // check this for a->b and b-> a mapping
        HashSet<Character> set = new HashSet<>(h.values());
        if(set.size() == h.values().size()) {
            return true;
        } else {
            return false;
        }

    }
}
