package queue;

public class Queue {

    Node front;
    Node rear;
public boolean isEmpty(){
    if(rear==null) return true;

    return false;
}
    public void enqueue(int x){
        Node newNode=new Node(x);
        if(isEmpty()){
            rear=front=newNode;
        }
        rear.next=newNode;
        rear=newNode;

    }
    public int dequeue(){
       int value;
         if (isEmpty())
         System.out.println("Queue is empty, nothing to Dequeue");
         value= front.value;;
       front=front.next;

        if(front == rear) front.next=null;
         return value;
    }
    public int peek(){

        if (isEmpty())
            System.out.println("Queue is empty, nothing to Peek");

        return front.value;

    }
    @Override
    public String toString() {
        String values = "";
        Node current = front; // Create a temporary variable to iterate through the nodes
        while (current != null) {
            values += current.value + "->";
            current = current.next;
        }
        values += "null";
        return values;

    }
}
