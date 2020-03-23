package strings.baseball_game_682;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

class SolutionWithIterator implements BaseballGame{
    ArrayDeque<Integer> stack = null; //valid points
    int result ;

    public int calPoints(String[] ops) {
        result = 0;
        stack = new ArrayDeque<>();

        for (String item : ops){
            if (item.equals("C"))
            {
                int value = stack.pop();
                result = result - value;
            }
            else if (item.equals("D")){

                Iterator<Integer> iterator = stack.iterator();
                int roundScore = iterator.next() * 2;

                stack.push(roundScore);
                result = result + roundScore;
            }
            else if (item.equals("+")) {

                Iterator<Integer> iterator = stack.iterator();
                int roundScore = iterator.next() + iterator.next();

                stack.push(roundScore);
                result += roundScore;
            }
            else {
                int value = Integer.valueOf(item);
                stack.push(value);
                result += value;
            }

        }

        return result;
    }
}
