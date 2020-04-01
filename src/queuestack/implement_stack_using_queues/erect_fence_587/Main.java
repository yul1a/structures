package queuestack.implement_stack_using_queues.erect_fence_587;

//587. Erect the Fence
//Hard
//There are some trees, where each tree is represented by (x,y) coordinate in a two-dimensional garden. Your job is to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed. Your task is to help find the coordinates of trees which are exactly located on the fence perimeter.
public class Main {
    public static void main(String[] args) {
      Solution s = new Solution();
        int[][] r =s.outerTrees(new int[][]{new int[]{1,1},new int[]{2,2},new int[]{2,0},new int[]{2,4},new int[]{3,3},new int[]{4,2}});

        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i][0] + " " + r[i][1]);
        }
        System.out.println(r +" : expected false");
    }
}