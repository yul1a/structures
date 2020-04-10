package challenge_30_days.day_09.backspaceCompare;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.backspaceCompare("y#fo##f","y#f#o##f") + "expected true");
        System.out.println(s.backspaceCompare("a#c","b") + "expected false");
        System.out.println(s.backspaceCompare("ab#c","ad#c") + "expected true");
        System.out.println(s.backspaceCompare("ab##","c#d#") + "expected true");
        System.out.println(s.backspaceCompare("a##c","#a#c") + "expected true");

    }
}