package challenge_30_days.day_10.minstack;


public class MinStack {

    int min;
    public MinStack() {

    }

    public int top() {
        return current.item;
    }

    public int getMin() {
        return min;
    }

    public class Node {
        public int item;
        public Node next;
    }

    Node current;

    public void push(int item){

        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;

        Node oldNode = current;

        current = newNode;
        current.next = oldNode;

        if (item < min || oldNode == null){
            min = item;
        }
    }

    public void pop(){
        int oldCurrent = current.item;
        current = current.next;

        if (oldCurrent == min && current != null){
            min = current.item;
            Node c = current;
            while (c != null){
                if (c.item < min){
                    min = c.item;
                }
                c = c.next;
            }
        }
    }

}
