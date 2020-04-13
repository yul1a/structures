package challenge_30_days.day_12.lastStoneWeight;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.lastStoneWeight(new int[]{2,7,4,1,8,1}) + "expected 1");
        System.out.println(s.lastStoneWeight(new int[]{1,1,1,1,1,1}) + "expected 0");
    }
}