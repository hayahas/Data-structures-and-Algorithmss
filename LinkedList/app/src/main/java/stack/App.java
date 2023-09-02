package stack;

public class App {


    public static void main(String[] args) {

        Stack s= new Stack();
        System.out.println(s.isEmpty());
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println("Stack : "+s.toString());
        System.out.println("First Value in stack : "+s.peek());
        System.out.println("Value popped : "+s.pop());
        System.out.println("Stack : "+s.toString());
        System.out.println("First Value in stack : "+s.peek());


    }

}
