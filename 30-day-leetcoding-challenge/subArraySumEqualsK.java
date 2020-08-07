// Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

// Example 1:

// Input:nums = [1,1,1], k = 2
// Output: 2

class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] preSum = new int[nums.length+1];
        preSum[0] = 0;
        for (int i = 1; i <= nums.length; i++) preSum[i] = preSum[i - 1] + nums[i-1];
        int result = 0;
        for (int i = 1; i < preSum.length; i++) {
            for (int j = i; j < preSum.length; j++) {
                if (preSum[j] - preSum[i-1] == k) result++;
            }
        }
        return result;      
    }
}