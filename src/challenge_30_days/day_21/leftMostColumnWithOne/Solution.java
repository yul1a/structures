package challenge_30_days.day_21.leftMostColumnWithOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {

        int n = binaryMatrix.dimensions().get(0); //columns left to right
        int m = binaryMatrix.dimensions().get(1); // rows top to bottom




        int left = 0;
        int right = n - 1;

        int minCol = -1;
        for (int i = 0; i < m; i++) {
            int row  = i;
            while(left<=right && right > 0 ){
                int mid = left + (right - left)/2;
                if(binaryMatrix.get(row, mid) == 1){
                    right = mid;
                }else{
                    left = mid+1;
                }
            }
            if (right < minCol)
                minCol = right;
            left = 0;
        }

        return minCol;

//        int width = binaryMatrix.dimensions().get(0); //columns left to right
//        int rows = binaryMatrix.dimensions().get(1); // rows top to bottom
//        int curColumn = 0; int curRow = rows - 1;
//        int result = -1;
//        while (curColumn < width && curRow >= 0) {
//            if (binaryMatrix.get(curColumn, curRow) == 0)
//                curColumn++;
//            else
//                result = curRow--;
//        }
//        return result;

    }

}

 class BinaryMatrix {
      int m;
      int n;
      int[][] grid;
      public BinaryMatrix(int[][] _grid ){
          this.grid = _grid;
          m = grid.length;
          n = grid[0].length;
      }

      public int get(int x, int y) {
        return grid[x][y];
      }
      public List<Integer> dimensions (){
          List<Integer> l = new ArrayList<>();
          l.add(n);
          l.add(m);
          return l;
     }
  };