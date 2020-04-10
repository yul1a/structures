package challenge_30_days.day_10.minstack;


public class Main {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        run3();
        run1();
        run2();

    }
    private static void run2(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-3);
        System.out.println(minStack.getMin()+ "expected -3");
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.top()+ "expected 0");
        System.out.println(minStack.getMin()+ "expected -2");
    }

    private static void run3(){
      //  ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
        //[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]


        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top()+ "expected 2147483647");
        minStack.pop();
        System.out.println(minStack.getMin()+ "expected 2147483646");
        minStack.pop();
        System.out.println(minStack.getMin()+ "expected 2147483646");
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top()+ "expected 2147483647");
        System.out.println(minStack.getMin()+ "expected 2147483647");
        minStack.push(-2147483648);
        System.out.println(minStack.top()+ "expected -2147483648");
        System.out.println(minStack.getMin()+ "expected -2147483648");
        minStack.pop();
        System.out.println(minStack.getMin()+ "expected 2147483647");
    }

    private static void run1(){
        MinStack s = new MinStack();

        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        System.out.println(minStack.top()+ "expected 2");
        System.out.println(minStack.getMin()+ "expected 1");
        minStack.pop();
        System.out.println(minStack.getMin()+ "expected 1");
        System.out.println(minStack.top()+ "expected 1");

//    Input:
//            ["MinStack","push","push","top","getMin","pop","getMin","top"]
//            [[],[1],[2],[],[],[],[],[]]
//    Output:
//            [null,null,null,2,0,null,0,1]
//    Expected:
//            [null,null,null,2,1,null,1,1]

    }

}