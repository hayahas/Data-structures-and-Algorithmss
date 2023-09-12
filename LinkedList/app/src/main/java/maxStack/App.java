package maxStack;

public class App {
    public static void main(String[] args) {
        MaxStack maxStack= new MaxStack();
        maxStack.push(20);
        maxStack.push(115);
        maxStack.push(10);
        maxStack.push(25);
        maxStack.push(330);
        maxStack.push(30);
        System.out.println("The Max value = " + maxStack.getMaxValue());//330
    }
}
