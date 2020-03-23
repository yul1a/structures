package strings.generate_parentheses_22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    //
    // не решила сама,    посмотрела на заголовки ликода что решается с дфс -  почитала про него и не решила тоже,
    // скопирала решение и подебажила и порисовала. надеюсь что раз сейчас через боль поняла как решать в следующий раз
    // смогу
    // In the dfs , left stands for the remaining number of (, right stands for the remaining number of ).
    List<String> generateParenthesis(int n){

        ArrayList<String> res = new ArrayList<String>();

        if (n < 2) return res;

        StringBuilder sb = new StringBuilder();
        sb.append("(");

        generate (res, sb, 1, 0 , n);
        return res;
    }

    //1
    void generate (List<String> res, StringBuilder sb, int openBracketCount, int closeBracketCount, int n) {
        if (sb.length() == n*2){
            res.add(sb.toString());
            return;
        }

        if (openBracketCount != n)
        {
            sb.append("(");
            generate(res, sb, openBracketCount + 1, closeBracketCount, n);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (closeBracketCount < openBracketCount)
        {
            sb.append(")");
            generate(res, sb,openBracketCount, closeBracketCount +1,n);
            sb.deleteCharAt(sb.length() - 1);
        }

    }


    public void dfs(ArrayList<String> result, String s, int left, int right){

//        ArrayList<String> res = new ArrayList<String>();
//        dfs(res, "", n, n);
//        return res;
//
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            dfs(result, s+"(", left-1, right);
        }

        if(right>0){
            dfs(result, s+")", left, right-1);
        }
    }
}