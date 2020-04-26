package challenge_30_days.day_22.subarraySum;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        int sum = 0;
        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sums.containsKey(sum - k))
                count = count + sums.get(sum - k);

            if (sums.containsKey(sum)){
                int c = sums.get(sum);
                sums.replace(sum, c + 1);
            }
            else
                sums.put(sum, 1);
        }



        return count;
    }
//brute force
//    public int subarraySum(int[] nums, int k) {
//
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] == k){
//                count++;
//            }
//
//            int sum = nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//                sum = sum + nums[j];
//                //System.out.println(sum);
//                if (sum == k){
//                    count++;
//                }
//            };
//        }
//        return count;
//    }
}