package queuestack.implement_stack_using_queues_225;

public class Main {
    public static void main(String[] args) {

      MyStackOnMyQueue();
      runJavaQueue();

    }

  private static void MyStackOnMyQueue(){
    int x = 1;
    int y = 2;
    int z = 3;
    MyStackOnMyQueue obj = new MyStackOnMyQueue();
    obj.push(z);
    obj.push(y);
    obj.push(x);

    System.out.println(obj.empty() + " : expected false");
    System.out.println(obj.top() + " : expected 1");
    System.out.println(obj.pop() + " : expected 1");
    System.out.println(obj.pop() + " : expected 2");
    System.out.println(obj.pop() + " : expected 3");
    System.out.println(obj.empty() + " : expected true");
  }
    private static void runJavaQueue(){
      int x = 1;
      int y = 2;
      int z = 3;
      MyStack obj = new MyStack();
      obj.push(z);
      obj.push(y);
      obj.push(x);

      System.out.println(obj.empty() + " : expected false");
      System.out.println(obj.top() + " : expected 1");
      System.out.println(obj.pop() + " : expected 1");
      System.out.println(obj.pop() + " : expected 2");
      System.out.println(obj.pop() + " : expected 3");
      System.out.println(obj.empty() + " : expected true");
    }
}