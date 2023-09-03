package stack;

public class App {


    public static void main(String[] args) {

        Stack s= new Stack();
        System.out.println(s.isEmpty());//true
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println("Stack : "+s.toString());//400-300-200-100
        System.out.println("First Value in stack : "+s.peek());//400
        System.out.println("Value popped : "+s.pop());//400
        System.out.println("Stack : "+s.toString());//300-200-100
        System.out.println("First Value in stack : "+s.peek());//300
        System.out.println(s.isEmpty());//false
        System.out.println("");

        ///////////////////////////////////////////////////////

        System.out.println("cc11");
        System.out.println("");
        PseudoQueue pq = new PseudoQueue();
        System.out.println(pq.isEmpty());//true
        pq.enqueue(20);
        pq.enqueue(15);
        pq.enqueue(10);
        pq.enqueue(5);

        System.out.println("Queue : "+pq.toString());//5-10-15-20-null
        System.out.println(pq.isEmpty());//false
        System.out.println("Value Dequeued : " + pq.dequeue()); //20
         System.out.println("Value Dequeued : " + pq.dequeue()); //15


    }

}
