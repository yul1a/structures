package strings.baseball_game_682;

import java.util.Iterator;
import java.util.Stack;

//https://leetcode.com/problems/baseball-game/submissions/

//Runtime: 2 ms, faster than 89.32% of Java online submissions for Baseball Game.
//        Memory Usage: 37.7 MB, less than 7.69% of Java online submissions for Baseball Game.

class SolutionWithLinkedListStack implements BaseballGame {
    LinkedListStack<Integer> stack = null; //valid points
    int result ;

    Integer last = 0;
    Integer lastPrev = 0;

    public int calPoints(String[] ops) {
        result = 0;
        stack = new LinkedListStack<>();

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

    public class LinkedListStack<T>   {

        public class Node<T> {
            public T item;
            public Node next;
        }

        Node current;

        public LinkedListStack(){

        }
        public void push(T item){
            Node newNode = new Node();
            newNode.item = item;
            newNode.next = null;

            Node oldNode = current;

            current = newNode;
            current.next = oldNode;

        }

        public T pop(){
            if (!empty()) {
                T item = (T) current.item;
                current = current.next;
                return item;
            }
            return null;
        }

        public boolean empty(){
            return current  == null;
        }



    }
}
