package challenge_30_days.day_12.lastStoneWeight;


/*
Last Stone Weight
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)



Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.


Note:

1 <= stones.length <= 30
1 <= stones[i] <= 1000
 */
class Solution {

    public int lastStoneWeight(int[] stones) {
        Heap h = new Heap(stones.length);

        for (int i = 0; i < stones.length; i++) {
            h.insert(stones[i]);
        }
        while (h.n > 1){
            int y = h.popMaximum();
            int x = h.popMaximum();

            if (x != y){
                h.insert( y - x); //the stone of weight x is totally destroyed
            }
            //else both stones are totally destroyed;
        }
        return h.n == 0 ? 0 : h.popMaximum();
    }


    public class Heap {
        private int[] arr;
        private int n = 0;

        public Heap(int capacity) {
            arr = new int[capacity];
        }

        public int popMaximum()
        {
            return arr[--n];
        }

        public void insert(int value) {
            int i = n-1;
            while (i >= 0 && value < arr[i]) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = value;
            n++;
        }
    }
}