package strings.basic_calculator_ii_227.length_of_last_word_58;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//227. Basic Calculator II
//Medium
//Implement a basic calculator to evaluate a simple expression string.
//The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
//Example 1:
//Input: "3+2*2"
//Output: 7
//Example 2:
//Input: " 3/2 "
//Output: 1
//Example 3:
//Input: " 3+5 / 2 "
//Output: 5

// решаю разбив строку на части разделенные операциями + и -
// чтобы умножение и деление высчитывать сразу и прибаволятьёубавлять это значение в зависимости от знака
// использую цикл и линкед лист внутри
class Solution {
    public int calculate(String s) {
        //3+2*3-10+5
        //3+2*2*2-6
        //3+22*2*2-6

        int zeroIndex = '0';
        int nineIndex = '9';
        int sum = 0;

        boolean positive = true;
        boolean multiplytonextnumber = false;
        boolean dividetonextnumber = false;
        LinkedList<Character> list = new LinkedList<Character>();
        LinkedList<Character> nextNumber = new LinkedList<Character>();
        int previousEvaluatedNumber = -1;

        for (int i = 0; i <= s.length() - 1; i++) {


            var lastSymbol = i == s.length() - 1 || arerestarespaces(s.substring(i));
            if (s.charAt(i) == ' ')
                continue;
            else if (s.charAt(i) == '*')
                if (multiplytonextnumber){
                    previousEvaluatedNumber = getCureval(multiplytonextnumber, -1, list, nextNumber);
                    list = new LinkedList<Character>();
                    nextNumber = new LinkedList<Character>();
                }
                else
                    multiplytonextnumber = true;
            else if (s.charAt(i) == '/')
                if (dividetonextnumber){
                    previousEvaluatedNumber = getCureval(multiplytonextnumber, -1, list, nextNumber);
                    list = new LinkedList<Character>();
                    nextNumber = new LinkedList<Character>();
                }
                else
                    dividetonextnumber = true;
            else if ((s.charAt(i) >= zeroIndex && s.charAt(i) <= nineIndex )) {

                if (multiplytonextnumber || dividetonextnumber)
                    nextNumber.add(s.charAt(i));
                else
                    list.add(s.charAt(i));
            }

            if (s.charAt(i) == '+' || s.charAt(i) == '-' || lastSymbol) {

                if (multiplytonextnumber || dividetonextnumber) {

                    //evaluate number
                    int cureval = getCureval(multiplytonextnumber, previousEvaluatedNumber, list, nextNumber);

                    //end evaluate number


                    if (positive) { // previous value ready to be evaluated and do 'add'
                            sum = sum + cureval;
                    } else {
                            sum = sum - cureval;
                    }
                }
                else {
                    String firstNumber = new String();
                    while (!list.isEmpty() ){
                        firstNumber = firstNumber + list.removeFirst();
                    }
                    int first = Integer.valueOf(firstNumber);
                    sum = positive ? sum  + first : sum - first;
                }

                //for next iterations we:
                positive = s.charAt(i) == '+'; // next time we add evaluated value
                multiplytonextnumber = dividetonextnumber = false;
                list = new LinkedList<Character>();
                nextNumber = new LinkedList<Character>();
            }

        }

        return sum;
    }

    private Boolean arerestarespaces(String s){
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) != ' ')
                return false;
        }
        return true;
    }
    private int getCureval(boolean multiplytonextnumber, int previousEvaluatedNumber, LinkedList<Character> list, LinkedList<Character> nextNumber) {
        int first = previousEvaluatedNumber;
        if (previousEvaluatedNumber == -1 ) {
            String firstNumber = new String();
            while (!list.isEmpty()) {
                firstNumber = firstNumber + list.removeFirst();
            }
            first = Integer.valueOf(firstNumber);
        }
        String nextS = new String();
        while (!nextNumber.isEmpty()){
            nextS = nextS + nextNumber.removeFirst();
        }
        int next = Integer.valueOf(nextS);

        return multiplytonextnumber ? first * next : first / next;
    }
}