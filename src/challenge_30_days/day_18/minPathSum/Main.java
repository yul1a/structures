package challenge_30_days.day_18.minPathSum;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minPathSum(getArray1()) + ", expected 7");
        System.out.println(s.minPathSum(getArray2()) + ", expected 0");
        System.out.println(s.minPathSum(getArray3()) + ", expected 5");
        System.out.println(s.minPathSum(getArray4()) + ", expected 0");
    }

    private static int[][] getArray1() {

        return new int[][]{
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1}
        };
    }

    private static int[][] getArray2() {

        return new int[][]{
                new int[]{0, 0, 1},
                new int[]{1, 0, 0},
                new int[]{4, 2, 0}
        };
    }

    private static int[][] getArray3() {

        return new int[][]{
                new int[]{1, 2, 2},
                new int[]{1, 1, 1},
                new int[]{4, 1, 1}
        };
    }
    private static int[][] getArray4() {

        return new int[][]{
                new int[]{}
        };
    }



}