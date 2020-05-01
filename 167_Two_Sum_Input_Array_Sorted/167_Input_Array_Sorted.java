class Solution {
    /*
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2
    */

    public int[] twoSum(int[] numbers, int target) {
        // base case when the size of numbers is less than 2
        //
        if(numbers.length < 2) {
            return new int[]{0,0};
        }
        // keep two pointers , one will point to last index and one will point to first index of the array
        //
        int last_index = numbers.length-1;
        int front_index = 0;

        // loop until you have the condition last_index == front_index
        //
        while(last_index >= front_index) {
            // if the sum of the two numbers at the front index and the last index is greater than the target, we know we have to move 
            // to the smaller elements, so we do last_index--
            if(numbers[front_index] + numbers[last_index] > target) {
                last_index--;
            }  else if(numbers[front_index] + numbers[last_index] < target) {
                // if the sum is less than the target, we have to go to a larger number, so we increase the font_index pointer
                front_index++;
            } else if(numbers[front_index] + numbers[last_index] == target) {
                // if the sum is equal to the target, then we return the two indices.
                return new int[]{front_index+1,last_index+1};
            }  
        }

        return new int[]{0,0};
    }
}
