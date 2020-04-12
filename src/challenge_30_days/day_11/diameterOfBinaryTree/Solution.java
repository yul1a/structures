package challenge_30_days.day_11.diameterOfBinaryTree;

import com.sun.source.tree.Tree;

/*Diameter of Binary Tree
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 */
public class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode node) {
        max = 0;
        diameter(node);
        return max;
    }

    public int diameter(TreeNode node){
        if (node == null)
            return 0;
        int left = diameter(node.left);
        int right = diameter(node.right);

        max = left + right > max ? left + right : max;

        return left > right ? left + 1 : right + 1;
    }
}