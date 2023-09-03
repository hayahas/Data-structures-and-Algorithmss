package queue;

public class App {
    public static void main(String[] args) {

        Queue q = new Queue();
        System.out.println(q.isEmpty());//true
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.enqueue(400);
        System.out.println("Queue : "+q.toString()); //100-200-300-400
        System.out.println("First Value in queue : "+q.peek());//100
        System.out.println("value dequeued : "+q.dequeue());//100
        System.out.println("Queue : "+q.toString());//200-300-400
        System.out.println("First Value in queue : "+q.peek());//200
        System.out.println(q.isEmpty());//false
    }
}
