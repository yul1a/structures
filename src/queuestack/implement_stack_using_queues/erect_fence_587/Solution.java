package queuestack.implement_stack_using_queues.erect_fence_587;

import java.util.*;

class Solution {
    //Input: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
    //Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
    //https://leetcode.com/problems/erect-the-fence/discuss/103302/Java-Graham-scan-with-adapted-sorting-to-deal-with-collinear-points
    public  int[][] outerTrees(int[][] p) {
        Point[] points = new Point[p.length];
        for (int i = 0; i < p.length; i++) {
            points[i] = new Point(p[i][0], p[i][1]);
        }
        List<Point> r = run(points);
        int[][] result = new int[r.size()][2];
        for (int i = 0; i < r.size(); i++) {
            result[i] = new int[]{r.get(i).y, r.get(i).x};
        }
        return result;
    }
    private List<Point> run(Point[] points) {
        if (points.length <= 1)
            return Arrays.asList(points);
        sortByPolar(points, bottomLeft(points));
        Stack<Point> stack = new Stack<>();
        stack.push(points[0]);
        stack.push(points[1]);
        for (int i = 2; i < points.length; i++) {
            Point top = stack.pop();
            while (ccw(stack.peek(), top, points[i]) < 0)
                top = stack.pop();
            stack.push(top);
            stack.push(points[i]);
        }
        return new ArrayList<>(stack);
    }

    private static Point bottomLeft(Point[] points) {
        Point bottomLeft = points[0];
        for (Point p : points)
            if (p.y < bottomLeft.y || p.y == bottomLeft.y && p.x < bottomLeft.x)
                bottomLeft = p;
        return bottomLeft;
    }

    /**
     * @return positive if counter-clockwise, negative if clockwise, 0 if collinear
     */
    private static int ccw(Point a, Point b, Point c) {
        return a.x * b.y - a.y * b.x + b.x * c.y - b.y * c.x + c.x * a.y - c.y * a.x;
    }

    /**
     * @return distance square of |p - q|
     */
    private static int dist(Point p, Point q) {
        return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
    }

    private static void sortByPolar(Point[] points, Point r) {
        Arrays.sort(points, (p, q) -> {
            int compPolar = ccw(p, r, q);
            int compDist = dist(p, r) - dist(q, r);
            return compPolar == 0 ? compDist : compPolar;
        });
        // find collinear points in the end positions
        Point p = points[0], q = points[points.length - 1];
        int i = points.length - 2;
        while (i >= 0 && ccw(p, q, points[i]) == 0)
            i--;
        // reverse sort order of collinear points in the end positions
        for (int l = i + 1, h = points.length - 1; l < h; l++, h--) {
            Point tmp = points[l];
            points[l] = points[h];
            points[h] = tmp;
        }
    }

    private class Point {
        public int x;
        public int y;
        public Point (int _y, int _x){
            x = _x;
            y = _y;
        }

        public int ccw(Point o1, Point o2) {
            int r = (o1.x - x)*(o2.y - o1.y) - (o1.y - y) * (o2.x - x);
            return r > 0 ?  1 : r < 0 ? - 1 : 0;
        }
        public class PolarOrder implements Comparator<Point> {

            public int compare(Point o1, Point o2) {
                int dy1 = o1.y - y;
                int dy2 = o2.y - y;
                if (dy1 ==0 && dy2 == 0){

                }
                return -ccw(o1, o2);
            }
        }


    }


}
