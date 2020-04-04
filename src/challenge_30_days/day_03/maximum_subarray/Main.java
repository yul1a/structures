package challenge_30_days.day_03.maximum_subarray;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxSubArrayNaive(new int[]{-2,1,-3,4,-1,2,1,-5,4}) + " : expected 6");
        System.out.println(s.maxSubArrayNaive(new int[]{1,-3,4}) + " : expected 4");
        System.out.println(s.maxSubArrayNaive(new int[]{1}) + " : expected 1");
        System.out.println(s.maxSubArrayNaive(new int[]{-2,1}) + " : expected 1");
        System.out.println(s.maxSubArrayNaive(new int[]{-2,-3}) + " : expected -2");
        System.out.println(s.maxSubArrayNaive(new int[]{-1,0,-2}) + " : expected 0");
    }
}