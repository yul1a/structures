package strings.length_of_last_word_58;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.lengthOfLastWord("") + " : expected 0");
        System.out.println(s.lengthOfLastWord("hello") + " : expected 5");
        System.out.println(s.lengthOfLastWord("Hello Worldr ") + " : expected 6");
        System.out.println(s.lengthOfLastWord("Hello Worldr") + " : expected 6");
        System.out.println(s.lengthOfLastWord("  Hello") + " : 5");

    }
}