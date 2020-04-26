package challenge_30_days.day_24.canJump;

/*
Subarray Sum Equals K
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.canJump(new int[]{2,3,1,1,4})+ " : expected true");
        System.out.println(s.canJump(new int[]{3,2,1,0,4})+ " : expected false");
    }

}