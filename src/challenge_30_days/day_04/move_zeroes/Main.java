package challenge_30_days.day_04.move_zeroes;


public class Main {
    public static void main(String[] args) {
        print(new int[]{0,0,1}, new int[]{1,0,0});
        print(new int[]{0,1,0,3,12}, new int[]{1,3,12,0, 0});
        print(new int[]{1,0,3,12}, new int[]{1,3,12,0});

        print(new int[]{0,1,0,3,12}, new int[] {1,3,12,0,0});
        print(new int[]{0,-2,1,-3,4,-1,2,1,-5,4},new int[]{-2,1,-3,4,-1,2,1,-5,4, 0});
        print(new int[]{1,0,3,12,0}, new int[]{1,3,12,0, 0});
        print(new int[]{0}, new int[]{0});
        print(new int[]{1}, new int[]{1});

    //[0,0,1]
    //[0,1,0,3,12]
    //[1,0,3,12]
    //[0,1,0,3,12]
    //[0,-2,1,-3,4,-1,2,1,-5,4]
    //[1,0,3,12,0]
    //[0]
    //[1]
    }

    private static void print(int[] nums, int[] expected){
        Solution s = new Solution();
        System.out.println(" ");
        for (int item: nums){
            System.out.print(item + " ");
        }
        s.moveZeroes(nums);
        System.out.print(" expected:");
        for (int item: nums){
            System.out.print(item + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != expected[i]){
                System.out.println("error");
            }
            else
            {
                //System.out.print(" ok ");
            }
        }

    }
}