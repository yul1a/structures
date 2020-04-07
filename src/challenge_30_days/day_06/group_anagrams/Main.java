package challenge_30_days.day_06.group_anagrams;


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.groupAnagrams(new String[]{"duh","ill"}) );
        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}) );
        System.out.println(s.groupAnagrams(new String[]{"eat"}) );
        System.out.println(s.groupAnagrams(new String[]{}) );
        System.out.println(s.groupAnagrams(new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"}) );

        //Output:  [["buy"],["may"],["duh","ill"],["tin"],["bar"],["pew"],["cab"],["max"],["doc"]]
        //Expected:[["doc"],["bar"],["buy"],["ill"],["may"],["tin"],["cab"],["pew"],["max"],["duh"]]

    }
}