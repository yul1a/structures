package challenge_30_days.day_07.counting_elements;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countElements(new int[]{}) + "expecyed 0"  );
        System.out.println(s.countElements(new int[]{1,3,2,3,5,0}) + "expecyed 3"  );
        System.out.println(s.countElements(new int[]{1,2,3}) + "expecyed 2"  );
        System.out.println(s.countElements(new int[]{1,1,3,3,5,5,7,7}) + "expecyed 0"  );

//        Input: arr = [1,2,3]
//        Output: 2
//        Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
//                Example 2:
//
//        Input: arr = [1,1,3,3,5,5,7,7]
//        Output: 0
//        Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
//        Example 3:
//
//        Input: arr = [1,3,2,3,5,0]
//        Output: 3
//        Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
//                Example 4:
//
//        Input: arr = [1,1,2,2]
//        Output: 2
//        Explanation: Two 1s are counted cause 2 is in arr.

    }
}