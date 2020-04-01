package challenge_30_days.single_integer;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.singleNumber(new int[]{2,2,1}) + " : expected 1");
        System.out.println(s.singleNumber(new int[]{1,2,2}) + " : expected 1");
        System.out.println(s.singleNumber(new int[]{2,1,2}) + " : expected 1");
        System.out.println(s.singleNumber(new int[]{4,1,2,1,2}) + " : expected 4");
        System.out.println(s.singleNumber(new int[]{1}) + " : expected 1");

        System.out.println(s.singleNumberWithExtraMemory(new int[]{4,1,2,1,2}) + " : expected 4");

    }
}