package strings.generate_parentheses_22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> result = s.generateParenthesis(3);
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }
}