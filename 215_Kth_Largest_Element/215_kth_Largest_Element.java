class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        if(nums == null) {
            return 0;
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        
        for(int i : nums) {
           
            q.offer(i);
            
             if(q.size() > k) {
                q.poll();
            }
        }
        
        return q.peek();
        
    }
}
