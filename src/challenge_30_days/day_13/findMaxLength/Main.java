package challenge_30_days.day_13.findMaxLength;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.findMaxLength(new int[]{0}) + "expected 0");
        System.out.println(s.findMaxLength(new int[]{1}) + "expected 0");
        System.out.println(s.findMaxLength(new int[]{0,1,0, 1}) + "expected 4");
        System.out.println(s.findMaxLength(new int[]{0,1}) + "expected 2");
        System.out.println(s.findMaxLength(new int[]{0,1,0}) + "expected 2");

        System.out.println(s.findMaxLength(new int[]{0,1,0, 1,0}) + "expected 4");
    }
}