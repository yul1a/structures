package challenge_30_days.day_20.bstFromPreorder;


import challenge_30_days.day_11.diameterOfBinaryTree.TreeNode;

import static challenge_30_days.day_11.diameterOfBinaryTree.TreeNode.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t = s.bstFromPreorder(new int[]{8,5,1,7,10,12});
        System.out.println(" : expected [8,5,10,1,7,null,12]");

    }

}