package challenge_30_days.day_15.productExceptSelf;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = s.productExceptSelf(new int[]{1,2,3,4});
        for (int i: a){
            System.out.print(i + ",");
        }
        System.out.println( " expected 24,12,8,6");


    }
}