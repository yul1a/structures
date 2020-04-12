package challenge_30_days.day_11.diameterOfBinaryTree;



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.diameterOfBinaryTree(TreeNode.buildTree(new int[]{1})) + " : expected 0");
        System.out.println(s.diameterOfBinaryTree(TreeNode.buildTree(new int[]{1,2})) + " : expected 1");
        System.out.println(s.diameterOfBinaryTree(TreeNode.buildTree(new int[]{1,2,3,4,5})) + " : expected 3");
        System.out.println(s.diameterOfBinaryTree(TreeNode.buildTree(new int[]{1,2,3,4,5,6,6,6})) + " : expected 5");
        System.out.println(s.diameterOfBinaryTree(TreeNode.buildTree(new int[]{1,2,3,4,5,6,6,6,7,7,7,7,7,7,7,7,7,7}))
                + " : expected 7");

    }


}