class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
	   // Time complexity : O(nlog(k))
	    
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
        
        // inserting elements into the min heap.
        // if the min heap size > k, then we remove the elements from the priority queue
        // maintain a heap of size k.
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        
         //get all elements from the heap
        List<Integer> result = new ArrayList<>();
        while (queue.size() > 0) {
            //maintain a list of all the elements from the heap and check until the size of queue > 0
            result.add(queue.poll().getKey());
        }
        
        
        Collections.reverse(result);
        int[] primeArray = new int[result.size()];
         for (int i = 0; i < primeArray.length; i++) {
              primeArray[i] = result.get(i);
          }
        return  primeArray;
    }
}
