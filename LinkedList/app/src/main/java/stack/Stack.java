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

            if (isEmpty())
                System.out.println("Stack is empty, nothing to pop");


            int value = top.value;
            top = top.next;
            return value;
        }



public int peek(){

    if (isEmpty())
        System.out.println("Stack is empty, nothing to peek");


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
