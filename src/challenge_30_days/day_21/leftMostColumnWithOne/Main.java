package challenge_30_days.day_21.leftMostColumnWithOne;


import challenge_30_days.day_11.diameterOfBinaryTree.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        //System.out.println(s.leftMostColumnWithOne(new BinaryMatrix(new int[][]{ new int[]{0,1}, new int[] {0,1}})) + " : expected 1");
        //System.out.println(s.leftMostColumnWithOne(new BinaryMatrix(new int[][]{ new int[]{0,0}, new int[] {0,0}})) + " : expected -1");
        System.out.println(s.leftMostColumnWithOne(new BinaryMatrix(new int[][]{ new int[]{0,0}, new int[] {1,1}})) + " : expected 0");

    }

}