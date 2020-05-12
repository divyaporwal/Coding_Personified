class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        // create a hashmap of string, integer type
        Map<String, Integer> count = new HashMap();
        
        // store the word-> count , key->value pair in the hashmap
        for(String word: words) {
            count.put(word,count.getOrDefault(word,0) + 1);
        }
        
        // declare a list of strings which has the keys or the unique words as the values
        List<String> candidates = new ArrayList(count.keySet());
        
        // custom sort , where we first sort based on the count of word , if count1 = count2, then we sort based on the
        // words appearing in lexicographical order.
        Collections.sort(candidates, (w1,w2) -> count.get(w1).equals(count.get(w2)) ?
                         w1.compareTo(w2) : count.get(w2) - count.get(w1));
        // return top k elements from the list;
        
        return candidates.subList(0,k);
    }
}
