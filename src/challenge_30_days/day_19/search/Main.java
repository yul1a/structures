package challenge_30_days.day_19.search;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        // System.out.println(s.search(new int[]{1,3},2) + ", expected 2");

        System.out.println(s.search(new int[]{1},1) + ", expected 0");

        System.out.println(s.search(new int[]{},5) + ", expected -1");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2},5) + ", expected 1");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2},0) + ", expected 4");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2},3) + ", expected -1");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2},4) + ", expected 0");
        System.out.println(s.search(new int[]{4,5,6,7,0,1,2},2) + ", expected 6");

    }

}