package challenge_30_days.single_integer;

import java.util.HashSet;
import java.util.Set;

        /*Single Number
        Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4*/
public class Solution {

    public int singleNumber(int[] nums) {
        if (nums.length == 1 ){
            return nums[0];
        }
        int result = -1;

        //selection sort complexity + n
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] > nums[j]){
                    var smallerValue = nums[j];
                    nums[j] = nums[i];
                    nums[i] = smallerValue;
                }
            }
        }
        for (int i = 0; i < nums.length; i = i+2) {
            if (i+1  == nums.length || nums[i] != nums[i+1]){
                result = i;
                break;
            }
        }
        //selection sort complexity + n
        return nums[result];
    }

    public int singleNumberWithExtraMemory(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        Set<Integer> twiceSet = new HashSet<>() ;
        Set<Integer> singleSet = new HashSet<>() ;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (singleSet.contains(value))
            {
                singleSet.remove(value);
                twiceSet.add(value);
            }
            else {
                singleSet.add(value);
            }
        }

        return singleSet.iterator().next();
    }

}
