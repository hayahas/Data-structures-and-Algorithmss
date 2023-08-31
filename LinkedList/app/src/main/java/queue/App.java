package queue;

public class App {
    public static void main(String[] args) {

        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.enqueue(400);
        System.out.println("Queue : "+q.toString());
        System.out.println("First Value in queue : "+q.peek());
        System.out.println("value dequeued : "+q.dequeue());
        System.out.println("Queue : "+q.toString());
        System.out.println("First Value in queue : "+q.peek());
    }
}
