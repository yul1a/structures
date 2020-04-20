package challenge_30_days.day_17.numIslands;


/*
Number of Islands
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
*/
class Solution {
    int count;
    int n;
    int[] parent;
    byte[] rank;
    public int numIslands(char[][] grid) {

        int n = grid.length * grid[0].length;
        parent = new int[n];
        rank = new byte[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j< grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    this.count++;
                }
                int num =  GetIndex(i, j); // id in flat array
                this.parent[num] = num;
                this.rank[num] = 1;
            }
        }

        int width = grid[0].length;
        int height = grid.length;
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(grid[i][j] == '0') {
                    continue;
                }
                int p = i * width + j;
                int q;
                if(i < height - 1 && grid[i + 1][j] == '1') {
                    q = p + width;
                    union(p, q);
                }
                if(j < width - 1 && grid[i][j + 1] == '1') {
                    q = p + 1;
                    union(p, q);
                }
            }
        }

        return count;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // root of smaller tree to root of larger tree
        if      (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
        else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }
        count--;
    }

    public int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public int GetIndex(int i, int j) {
        return n * i + j;
    }
}

