package strings.friend_circles_547;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int[] uf ;
    int count ;
    public int findCircleNum(int[][] M) {
        int friends = M.length;
        uf = new int[friends];
        count = friends;
        for (int i = 0; i < friends; i++) {
            uf[i] = i;
        }

        for (int i = 0; i < friends; i++) {
            for (int j = 0; j < i; j++) {
                 if (M[i][j] == 1) {
                    union(i, j);
                 }

            }
        }
        for (int i = 0; i< friends; i++){
            System.out.print(uf[i] + " ");
        }

        return count;
    }
        private void union(int p, int q) {
            int i = root(p);
            int j = root(q);

            if (i == j) {
                return;
            }
            count--;
            uf[i] = j;
        }
        private int root (int i){
            while (i != uf[i]){
                uf[i] = uf[uf[i]];
                i = uf[i];
            }
            return i;
        }
}
