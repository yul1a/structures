package com.company;


import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements Collection {


    LinkedListNode head;
    LinkedListNode tail;
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public boolean contains(Object o) {

        LinkedListNode current = head;
        while (current != null) {
            if (current.value == o) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return null;
    }

    @Override
    public boolean add(Object o) {

        if (head == null) {
            LinkedListNode current = new LinkedListNode(o, null);
            head = current;
            tail = current;
        } else {
            LinkedListNode last = new LinkedListNode(o, tail);
            tail.next = last;
            tail = last;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {


        boolean result = false;
        LinkedListNode current = head;
        LinkedListNode previous = null;
        while (current != null) {
            if (current.value == o) {
                if (head == current) {
                    if (size == 1) {
                        head = null;
                        tail = null;
                        size = 0;
                        break;
                    }
                    head = current.next;
                    size--;
                    result = true;
                    break;
                } else if (tail == current) {
                    tail = previous;
                    size--;
                    result = true;
                    break;
                } else {
                    if (previous != null) {
                        previous.next = current.next;
                        size--;
                    }

                }
            }
            previous = current;
            current = current.next;
        }

        return result;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }


}

class LinkedListNode {

    public LinkedListNode(Object value, LinkedListNode previous) {
        value = value;
        previous.next = this;
    }

    Object value;
    LinkedListNode next;
}
