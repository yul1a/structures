package challenge_30_days.day_04.move_zeroes;

/*
Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
* */
public class Solution {

    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;
        int firstNonZeroPositionFromEnd = findfirstNonZeroPositionFromEnd(nums);
        if (firstNonZeroPositionFromEnd < 0)
            return; // no zero leave as is

        for (int i = 0; i <= firstNonZeroPositionFromEnd; i++) {
            if (nums[i] == 0){
                for (int j = i; j < firstNonZeroPositionFromEnd ; j++) {
                    nums[j] = nums[j+1];
                }
                nums[firstNonZeroPositionFromEnd] = 0;
                firstNonZeroPositionFromEnd--;
                if (nums[i] == 0)
                    i--;
            }
        }

    }
    private int findfirstNonZeroPositionFromEnd(int[] nums){

        int i = nums.length - 1;
        while (i >= 0)
        {
            if (nums[i] != 0){
                return  i;
            }
            i--;
        }
        return -1;
    }
}
