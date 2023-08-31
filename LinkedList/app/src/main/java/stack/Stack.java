package stack;

public class Stack {

    Node top;

    public Stack() {
    }

    public Stack(Node top) {
        this.top = top;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top=newNode;
    }

    public boolean isEmpty(){
        return top ==null;
    }
    public int pop() {
        try{
            if (isEmpty())
                throw new RuntimeException("Stack is empty");

        }catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
            return -1;
        }
            int value = top.value;
            top = top.next;
            return value;
        }



public int peek(){
    try{
        if (isEmpty())
            throw new RuntimeException("Stack is empty");

    }catch (IllegalArgumentException | IndexOutOfBoundsException e) {
        System.out.println("Exception: " + e.getMessage());
        return -1;
    }
       return top.value;

}
    @Override
        public String toString() {
        String values = "";
        Node current = top; // Create a temporary variable to iterate through the nodes
        while (current != null) {
            values += current.value + "->";
            current = current.next;
        }
        values += "null";
        return values;

    }
    }
