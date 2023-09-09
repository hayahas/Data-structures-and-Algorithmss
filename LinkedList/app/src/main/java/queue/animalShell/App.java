package queue.animalShell;

public class App {
    public static void main(String[] args) {
    AnimalShelter as = new AnimalShelter();
        System.out.println("isEmpty? "+as.isEmpty()); //true
        as.enequeue(new Animal("cat", "pitty"));
        as.enequeue(new Animal("dog", "ricky"));
        as.enequeue(new Animal("cat", "bees"));
        as.enequeue(new Animal("dog", "pit"));
        System.out.println("Queue : "+as.toString());//cat -> dog -> cat -> dog -> null
        System.out.println("isEmpty? "+as.isEmpty()); //false
        System.out.println("Value dequeued : " + as.dequeue("cat")); //catName: pitty
        System.out.println("Queue : "+as.toString()); //dog -> cat -> dog -> null
        System.out.println("Value dequeued : "+ as.dequeue("dog")); //dogName: ricky
        System.out.println("Queue : "+as.toString()); //cat -> dog -> null
    }}
