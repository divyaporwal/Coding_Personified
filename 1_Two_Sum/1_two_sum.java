class Solution {
    /*Given an array of integers, return indices of the two numbers such that they add up to a specific target.ou may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
    public int[] twoSum(int[] nums, int target) {
        // initialize a Hashmap were the key is the target-nums[i] and the value is the index of that element in the array
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // basic sanity check when the array length is less than 2 or 0.
        if (nums.length == 0 || nums.length < 2) {
            return new int[]{0,0};
        }

        // for loop to check if the element target - nums[i] is present in the hashMap , then return the index otherwise 
        // add the element and its index to the HashMap
        for(int i = nums.length-1; i >= 0; i--) {
            int temp = target-nums[i];
            
            if (map.containsKey(nums[i])) {
                // return the indices of the numbers that add to the target
                return new int[]{map.get(nums[i]), i};
            } else {
                // add the elements and the key to the HashMap
                map.put(target-nums[i], i);
            }
        }
        
        // return the sanity check array when there are no elements or two numbers in the array that add to the traget.
        return new int[]{0,0};
    }
}

