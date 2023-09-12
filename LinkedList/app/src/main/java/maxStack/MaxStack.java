package maxStack;

import maxStack.Node;


public class MaxStack {

        Node top;

        public MaxStack() {
        }

        public MaxStack(Node top) {
            this.top = top;
        }

        public void push(int value){
          Node newNode = new Node(value);
            newNode.next=top;
            top = newNode;
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

     public int getMaxValue(){
        int max = peek();
        pop();

        while (!isEmpty()){
            if (peek() > max){
                max = peek();
            }
                pop();
        }

    return max;
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


