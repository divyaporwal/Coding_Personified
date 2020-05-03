class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        //assuming nums1 size is less than nums2
        //otherwise swap them
        if(nums1.length > nums2.length) {
            return intersect(nums2,nums1);
        }
        
        
        HashMap<Integer,Integer> h = new HashMap<>();
        
        
        // add elements of nums1 into the hashmap h
        for(int n : nums1) {
            h.put(n,h.getOrDefault(n,0) + 1);
        }
        
        int k = 0;
        
        //check if the key is present and if yes, get the count value,
        // if the count value > 0, add it to the array that we are returning.
        for(int n : nums2) {
            int count = h.getOrDefault(n,0);
            if(count > 0) {
                nums1[k++] = n;
                h.put(n,count-1);
            }
        }
        
        return Arrays.copyOfRange(nums1,0,k);
    }
}
