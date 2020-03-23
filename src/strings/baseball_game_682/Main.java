package strings.baseball_game_682;

/*
682. Baseball Game

Runtime: 2 ms, faster than 89.32% of Java online submissions for Baseball Game.
Memory Usage: 37.9 MB, less than 7.69% of Java online submissions for Baseball Game.

You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.

Example 1:
Input: ["5","2","C","D","+"]
Output: 30
Explanation:
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get 2 points. The sum is: 7.
Operation 1: The round 2's data was invalid. The sum is: 5.
Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
Round 4: You could get 5 + 10 = 15 points. The sum is: 30.

 */
public class Main {
    public static void main(String[] args) {
        run(new SolutionWithArrayBasedStack());
        run(new SolutionWithListStackIterator());
        run(new SolutionWithLinkedListStack());
        run(new SolutionWithIterator());
        run(new SolutionWithJavaStack());
    }
    private static void run(BaseballGame s){
        System.out.println(s.calPoints(new String[]{"15788","25148","-24609","24869","D","-23282","14614","-2921","C","-26517","1891","C","-18324","+","+","-23184","D","-12585","C","D","7308","-11988","-16148","+","8834","+","+","D","19519","+","11289","+","D","C","-13033","D","+","-278","-14043","C","-906","C","28518","C","-29295","-22758","-13872","-20255","29870","-1104"}) + " expected: ?");
        System.out.println(s.calPoints(new String[]{"5","2","C","D","+"}) + " expected: 30");
        System.out.println(s.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}) + " expected: 27");
        System.out.println(s.calPoints(new String[]{"80","71","-74","D","74","-61","96","+","C","70"}) + " expected: 108");
        System.out.println(s.calPoints(new String[]{"5","2","C","C","1"}) + " expected: 1");
        System.out.println(s.calPoints(new String[]{"1","C","-62","-45","-68"}) + " expected: -175");
        System.out.println(s.calPoints(new String[]{"-60","D","-36","30","13","C","C","-33","53","79"}) + " expected: -117");
    }
}
