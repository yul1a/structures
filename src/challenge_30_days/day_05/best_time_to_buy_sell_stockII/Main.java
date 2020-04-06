package challenge_30_days.day_05.best_time_to_buy_sell_stockII;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{7, 1, 5, 3, 6, 4}) + "expected 7");
        System.out.println(s.maxProfit(new int[]{1,2,3,4,5}) + "expected 4");
        System.out.println(s.maxProfit(new int[]{7,6,4,3,1}) + "expected 0");
    }
}