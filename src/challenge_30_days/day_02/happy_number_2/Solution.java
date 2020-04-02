package challenge_30_days.day_02.happy_number_2;

import java.util.HashSet;
import java.util.Set;

/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number
equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.
Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
public class Solution {

    public boolean isHappy(int n) {
        if (n<1) return false;
        Set<Integer> met = new HashSet<>();
        met.add(n);
        int result = check(n, met);

        return result == 1;
    }

    private int check(int number, Set<Integer> met){

        var charArray = ("" + number).toCharArray();

        int sum = 0;
        for (char c: charArray){
            int i =  Character.getNumericValue(c);
            sum = sum + i * i;
        }
        if (sum == 1)
            return 1;
        if (met.contains(sum))
            return sum;
        met.add(sum);
        return check(sum, met);
    }
}
