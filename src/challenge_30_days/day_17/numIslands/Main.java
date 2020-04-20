package challenge_30_days.day_17.numIslands;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        //System.out.println(s.numIslands(getArray1()) + ", expected 1");
        System.out.println(s.numIslands(getArray2()) + ", expected 3");


    }

    private static char[][] getArray1(){
        return new char[][] {
                new char[]{'1','1','1','1','0'},
                new char[]{'1','1','0','1','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','0','0','0'}
        };
    }

    private static char[][] getArray2(){
        return new char[][] {
                new char[]{'1','1','0','0','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','1','0','0'},
                new char[]{'0','0','0','1','1'}
        };

    }
}