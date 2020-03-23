package strings.baseball_game_682;

import java.util.Stack;

//https://leetcode.com/problems/baseball-game/submissions/

class SolutionWithJavaStack implements BaseballGame {
    Stack<Integer> stack = null; //valid points
    int result ;

    Integer last = 0;
    Integer lastPrev = 0;

    public int calPoints(String[] ops) {
        result = 0;
        stack = new Stack<>();

        for (String item : ops){
            if (item.equals("C"))
            {
                int value = stack.pop();
                result = result - value;

                int locallast = ! stack.empty() ? stack.pop() : 0;
                int locallastPrev = ! stack.empty() ? stack.pop() : 0;
                stack.push(locallastPrev);
                stack.push(locallast);

                lastPrev = locallastPrev;
                last = locallast;
            }
            else if (item.equals("D")){

                int roundScore = last * 2;

                stack.push(roundScore);
                result = result + roundScore;

                lastPrev = last;
                last = roundScore;
            }
            else if (item.equals("+")) {

                int roundScore = last + lastPrev;
                result = result  + roundScore;
                stack.push(roundScore);

                lastPrev = last;
                last = roundScore;
            }
            else {
                int value = Integer.valueOf(item);
                stack.push(value);
                result += value;

                lastPrev = last;
                last = value;
            }

            //System.out.println("Round " + result);

        }

        //Every integer represented in the list will be between -30000 and 30000.

        // knowing input size
        //The size of the input list will be between 1 and 1000.
        //i can do fast with knowing memory array
        // faster with depends of input size
        //implement array stack and linkedlist stack
        //do both
        //count memory size

        return result;
    }
}
