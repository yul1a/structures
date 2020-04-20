package challenge_30_days.day_19.search;

/**
 Search in Rotated Sorted Array
 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.

 Your algorithm's runtime complexity must be in the order of O(log n).

 Example 1:

 Input: nums = [4,5,6,7,0,1,2], target = 0
 Output: 4
 Example 2:

 Input: nums = [4,5,6,7,0,1,2], target = 3
 Output: -1
 */

class Solution {
    public int search(int[] nums, int target) {

        int pos = binarySearch(nums, 0, nums.length -1, target, false);
        return pos;
    }
    int binarySearch(int[] nums, int from, int to, int target, boolean checkWhole){
        if (from > to){
            return -1;
        }
        if (nums.length == 0){
            return -1;
        }
        int mid = from + (to-from)/2;
        if (target == nums[mid])
            return mid;
        if (target <= nums[mid] ) {
            if (!checkWhole  && target < nums[from]) {
                mid = (nums.length - 1) / 2;
                return binarySearch(nums, mid, nums.length - 1, target, true);
            } else if (target > nums[from]) {
                return binarySearch(nums, from, mid -1, target, false);
            }
        }
        else  {
            if ( target < nums[to] ) {
                return binarySearch(nums, mid +1, to, target, false);
            } else if (!checkWhole && target > nums[to]) {

                mid = (nums.length - 1) / 2;
                return binarySearch(nums, 0, mid, target, true);
            }
        }
        return -1;
    }
}