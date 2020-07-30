// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Example:

// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Note:

// You must do this in-place without making a copy of the array.
// Minimize the total number of operations.

class Solution {
    public void moveZeroes(int[] nums) {
       int lastIndex = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
              nums[lastIndex] = nums[i];
              lastIndex++;
           }
       }
       for(int i = lastIndex; i < nums.length; i++){
           nums[i] = 0;
       }
    }
}
