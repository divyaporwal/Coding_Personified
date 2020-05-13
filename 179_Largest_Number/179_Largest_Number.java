class Solution {
    
    // Time complexity : O(nlogn)
    // Space complexity : O(n)
    
    public String largestNumber(int[] nums) {
        
        String[] arr = new String[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
    
        for(String s : arr) {
            sb.append(s);
        }
        
        // writing base case when all are 0s
        // delete all 0's until only one is left
        
        while(sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}