package strings.basic_calculator_ii_227.length_of_last_word_58;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.calculate(" 3/2 ") + " : expected 1");
        System.out.println(s.calculate("3+2*2*2-6") + " : expected 5");
        System.out.println(s.calculate("3*2") + " : expected 6");
        System.out.println(s.calculate("3+2") + " : expected 5");
        System.out.println(s.calculate("3+2*2") + " : expected 7");
        System.out.println(s.calculate(" 3/2 ") + " : expected 1");
        System.out.println(s.calculate(" 3+5 / 2 ") + " : expected 5");
        System.out.println(s.calculate("3+2*3-10+5") + " : expected 4");


    }
}