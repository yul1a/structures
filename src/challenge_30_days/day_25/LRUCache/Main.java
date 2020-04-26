package challenge_30_days.day_25.LRUCache;


public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1) +  " returns 1");
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2)+  "        // returns -1 (not found)");
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1)+  "        // returns -1 (not found)");
        System.out.println(cache.get(3)+  "        // returns 3");
        System.out.println(cache.get(4)+  "        // returns 4");

    }

}