package queue;
public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value, null);
        if (isEmpty()){
            rear = front = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, nothing to Dequeue");
        }
        T value = front.value;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, nothing to Peek");
        }
        return front.value;
    }

    @Override
    public String toString() {
        StringBuilder values = new StringBuilder();
        Node<T> current = front;
        while (current != null) {
            values.append(current.value).append("->");
            current = current.next;
        }
        values.append("null");
        return values.toString();
    }
}