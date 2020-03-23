package strings.baseball_game_682;

import java.util.Iterator;

class SolutionWithArrayBasedStack implements BaseballGame{
    ArrayStack<Integer> stack = null; //valid points
    int result ;

    public int calPoints(String[] ops) {
        result = 0;
        stack = new ArrayStack<>();

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

    public class ArrayStack<T> implements Iterable  {

        Object[] array;
        int last;

        public ArrayStack(){
            array = new Object[20];
            last = - 1;
        }
        public void push(T item){
            if (last == array.length - 1) {
                copyToNewArraySize(array.length * 2);
            }
            array[++last] = item;

        }

        public T pop(){
            if (!empty()) {
                T item = (T) array[last];
                last = last - 1;

                if (array.length > 20 && array.length > last * 4){
                    copyToNewArraySize((last + 1)  );
                };

                return item;
            }
            return null;
        }

        public boolean empty(){
            return last  == -1;
        }

        public Iterator iterator(){
            return new ArrayBasedStackIterator();
        }

        private void copyToNewArraySize(int newSize){

            Object[] newArray = new Object[newSize];
            for (int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }


        private class ArrayBasedStackIterator implements Iterator<Integer> {
            private int currentIt = last;

            public boolean hasNext(){
                return currentIt != - 1;
            }

            public Integer next(){
                return (Integer)array[currentIt--];
            }
        }
    }
}
