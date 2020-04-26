package challenge_30_days.day_25.LRUCache;

import java.util.HashMap;

class LRUCache {

    int size;
    int limit;
    HashMap<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        limit = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            addFirst(head, n);
            return n.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            n.val = value;
            remove(n);
            addFirst(head, n);
            return;
        }
        Node node = new Node(key, value);
        if(limit == 0) return;
        addFirst(head, node);
        if(size < limit)
            ++size;
        else
            removeLast(tail, map);
        map.put(key, node);
    }

    public void addFirst(Node head, Node node){
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public void removeLast(Node tail, HashMap<Integer, Node> map){
        Node prev = tail.prev;
        Node prepre = prev.prev;
        prev.next = null;
        prev.prev = null;
        prepre.next = tail;
        tail.prev = prepre;
        map.remove(prev.key);
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        node.prev = null;
        node.next = null;
        prev.next = next;
        next.prev = prev;
    }

    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        public Node(int k, int v) { key = k; val = v; next = null; prev = null; }
    }
}
