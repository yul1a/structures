package queuestack.implement_stack_using_queues_225;

public class MyStackOnMyQueue {

    MyQueue<Integer> queue = new MyQueue<>();
    /** Initialize your data structure here. */
    public MyStackOnMyQueue() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        int n = queue.size() - 1;
        while (n-- > 0){
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

    private class Node<T>{
        Node next;
        T item;
    }
    private class MyQueue<T> {

        Node<T> first;
        Node<T> last;
        int size = 0;
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean add(T t) {
            Node oldLast = last;
            Node newLast = new Node();
            newLast.item = t;
            last = newLast;
            if (isEmpty()){
                first = last;
            }
            else
                oldLast.next = newLast;
            size++;
            return true;
        }

        public T poll() {
            size--;
            T item = first.item;
            first = first.next;
            return item;
        }

        public T peek() {
            return first.item;
        }
    }
}
