package challenge_30_days.day_02.happy_number_2;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(7) + " : expected true");
        System.out.println(s.isHappy(12) + " : expected false");
        System.out.println(s.isHappy(19) + " : expected true");
        System.out.println(s.isHappy(1) + " : expected true");
        System.out.println(s.isHappy(100000000) + " : expected true");



    }
}