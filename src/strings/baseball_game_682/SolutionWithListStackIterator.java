package strings.baseball_game_682;

import java.util.Iterator;

class SolutionWithListStackIterator implements BaseballGame{
    LinkedListStack<Integer> stack = null; //valid points
    int result ;

    public int calPoints(String[] ops) {
        result = 0;
        stack = new LinkedListStack<>();

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

            //System.out.println("Round " + result);

        }

        return result;
    }

    public class LinkedListStack<T> implements Iterable  {

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

        public Iterator iterator(){
            return new LinkedListStackIterator();
        }

        private class LinkedListStackIterator implements Iterator<Integer> {
            private Node currentIt = current;
            public LinkedListStackIterator(){

            }
            public boolean hasNext(){
                return currentIt != null;
            }

            public Integer next(){
                Integer item = (Integer)currentIt.item;
                currentIt = currentIt.next;
                return item;
            }
        }
    }
}
