class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length < 2 || k < 0) {
            return 0;
        }
     int count = 0;
        
      HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
      
        // put all the key->value pair inside the hashMap
      for(int i = 0; i < nums.length; i++) {
          h.put(nums[i],h.getOrDefault(nums[i], 0) + 1);
      }
        
      // iterate the hashmap
      for(int n : h.keySet()) {
          if (k == 0) {
              if(h.get(n) >= 2) {
                  count++;
              }
          } else if(h.containsKey(n + k)) {
              count++;
          }
      }        
      return count;
    }
}
