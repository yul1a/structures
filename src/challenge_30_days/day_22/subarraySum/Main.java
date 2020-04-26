package challenge_30_days.day_22.subarraySum;

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
        System.out.println(s.subarraySum(new int[]{-1,1,1,1,1}, 2) + " : expected 4");

//        System.out.println(s.subarraySum(new int[]{-1}, -2) + " : expected 0");
//        System.out.println(s.subarraySum(new int[]{-1}, -1) + " : expected 1");
//        System.out.println(s.subarraySum(new int[]{1}, 2) + " : expected 0");
//        System.out.println(s.subarraySum(new int[]{2}, 2) + " : expected 1");
//        System.out.println(s.subarraySum(new int[]{1,1,1}, 2) + " : expected 2");
//        System.out.println(s.subarraySum(new int[]{1,1,1,-1}, 2) + " : expected 3");

    }

}