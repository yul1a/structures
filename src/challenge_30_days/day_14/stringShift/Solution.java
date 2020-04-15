package challenge_30_days.day_14.stringShift;

/*
Perform String Shifts
You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift).
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.



Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation:
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"


Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100
 */
class Solution {
    public String stringShift(String s, int[][] shift) {
        char[] strArray = s.toCharArray();
        MyList list = new MyList();
        for (int i = 0; i < strArray.length; i++) {
            list.addTail(strArray[i]);
        }

        for (int i = 0; i < shift.length; i++) {
            boolean left = shift[i][0] == 0;
            int count = shift[i][1];
            if (left) {
                while (count >0){
                    Character c = (Character) list.pollHead(); //head.abc.tail  //head.bca
                    list.addTail(c);
                    count--;
                }
            }
            else {
                while (count >0){
                    Character c = (Character) list.pollTail();
                    list.addHead(c);
                    count--;
                }
            }
        }
        char[] r = new char[list.size];
        MyList.Node node = list.head;
        for (int i = 0; i < r.length; i++) {
            r[i] = (char)node.item;
            node = node.toTail;
        }
        return new String(r);
    }

    private class MyList<T> {

        Node<T> head;
        Node<T> tail;
        int size = 0;
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean addHead(T t) {
            Node oldFirst = head;
            Node newFirst = new Node();
            newFirst.toTail = oldFirst;
            newFirst.item = t;
            head = newFirst;
            if (isEmpty()){
                head = tail;
            }
            else
                oldFirst.toHead = newFirst;
            size++;
            return true;
        }

        public boolean addTail(T t) {
            Node oldLast = tail;
            Node newLast = new Node();
            newLast.toHead = oldLast;
            newLast.item = t;
            tail = newLast;
            if (isEmpty()){
                head = tail;
            }
            else
                oldLast.toTail = newLast;
            size++;
            return true;
        }

        public T pollHead() {
            size--;
            T item = head.item;
            head = head.toTail;
            head.toHead = null;
            return item;
        }

        public T pollTail() {
            size--;
            T item = tail.item;
            tail = tail.toHead;
            tail.toTail = null;
            return item;
        }

        public class Node<T>{
            Node toTail;
            T item;
            Node toHead;
        }
    }
}