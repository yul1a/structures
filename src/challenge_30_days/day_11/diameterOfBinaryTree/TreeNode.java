package challenge_30_days.day_11.diameterOfBinaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static void preOrder(TreeNode node)
    {   if (node == null) { return; }
        preOrder(node.left);
        System.out.printf("%s ", node.val);
        preOrder(node.right);
    }

    public static TreeNode buildTree(int[] arr){
        TreeNode n = build(arr, new TreeNode(arr[0]),0);
        //spreOrder(n);
        return n;
    }

    private static TreeNode build(int[] arr, TreeNode head,int i)
    {
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            head = temp;

            head.left = build(arr, head.left,2 * i + 1);

            head.right = build(arr, head.right,2 * i + 2);
        }
        return head;
    }
}
