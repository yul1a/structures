package challenge_30_days.day_03.maximum_subarray;

import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/
public class Solution {


    public int maxSubArrayNaive(int[] nums) {
        int sum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];

            if (sum < current)
                sum = current;

            for (int j = i+1; j < nums.length ; j++) {
                current = current + nums[j];
                if (sum < current){
                    sum = current;
                }
            }
        }

        return sum;
    }

    int[] nums;
    int sum = 0;
    public int maxSubArrayDivideAndConquer(int[] _nums) {
        if (_nums.length == 1)
            return _nums[0];
        sum = _nums[0];
        nums = _nums;

        find(0, nums.length - 1);

        return sum;
    }

    private int find(int left, int right){
        if (right <= left){
            return sum;
        }
        int mid = left + right / 2 ;
        int sumLeft = find(0, mid );
        int sumRight = find(mid+1, right );
        int sumAll = 0;
        int sumMedium = 0;
        int localMax = sumLeft > sumRight ? sumLeft : sumRight;
        if (nums[left] + nums[right] > localMax) {
            localMax = nums[left] + nums[right];
        }

        if (localMax > sum){
            sum = localMax;
        }
        return  localMax;
    }




    /*[-2,1,-3,4,-1,2,1,-5,4]
            [1,-3,4]
            [-1,0,-2]
            [-2,-3]
            [-2,1]
            [0]
            [1]
            [1,-3,4]*/
}
