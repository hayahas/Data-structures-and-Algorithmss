package stack;

public class Stack<T> {

    Node<T> top;

    public Stack() {
    }

    public Stack(Node top) {
        this.top = top;
    }

    public void push(T value){
        Node<T>newNode = new Node(value);
        newNode.next=top;
        top = newNode;
    }

    public boolean isEmpty(){
        return top ==null;
    }
    public T pop() {

            if (isEmpty())
                System.out.println("Stack is empty, nothing to pop");


            T value = top.value;
            top = top.next;
            return value;
        }



public T peek(){

    if (isEmpty())
        System.out.println("Stack is empty, nothing to peek");


       return top.value;

}


   public boolean validateBrackets(String str){

        Stack<Character> s = new Stack<>();

        for(int i=0 ; i<str.length();i++){

            if(str.charAt(i) == '{' ||str.charAt(i) == '(' ||str.charAt(i) == '[' )
                s.push(str.charAt(i));
            if(str.charAt(i) == '}' && s.peek() == '{' || str.charAt(i) == ')' && s.peek() == '(' || str.charAt(i) == ']'&& s.peek() == '[' )
                s.pop();

        }
        return s.isEmpty();



}



    @Override
        public String toString() {
        String values = "";
        Node<T> current = top; // Create a temporary variable to iterate through the nodes
        while (current != null) {
            values += current.value + "->";
            current = current.next;
        }
        values += "null";
        return values;

    }
    }
