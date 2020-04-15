package challenge_30_days.day_14.stringShift;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.stringShift("abc", new int[][]{new int[]{0,1},new int[]{1,2}}) + "expected cab");
        System.out.println(s.stringShift
                ("abcdefg", new int[][]{new int[]{1,1},new int[]{1,1}, new int[]{0,2}, new int[]{1,3}})
               + "expected efgabcd");
    }
}