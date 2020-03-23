package strings.friend_circles_547;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int data[][] = new int[3][3];

        /*[[1,1,0],
         [1,1,0],
         [0,0,1]]*/
        //row1
        data[0][0] = 1;
        data[0][1] = 1;
        data[0][2] = 0;

        //row2
        data[1][0] = 1;
        data[1][1] = 1;
        data[1][2] = 0;

        //row3
        data[2][0] = 0;
        data[2][1] = 0;
        data[2][2] = 1;

        /*Output: 2
        Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
        The 2nd student himself is in a friend circle. So return 2.*/
        int i = s.findCircleNum(data);
        System.out.println(i + " expected: 2");

        /*Input:
        [[1,1,0],
         [1,1,1],
         [0,1,1]]
        Output: 1
        Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends,
                so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.*/

        //row1
        data[0][0] = 1;
        data[0][1] = 1;
        data[0][2] = 0;

        //row2
        data[1][0] = 1;
        data[1][1] = 1;
        data[1][2] = 1;

        //row3
        data[2][0] = 0;
        data[2][1] = 1;
        data[2][2] = 1;

        i = s.findCircleNum(data);
        System.out.println(i + " expected: 1");
    }
}
