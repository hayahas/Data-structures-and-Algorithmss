package queue.animalShell;

import queue.Node;
import queue.Queue;



public class AnimalShelter<T> {
    private Node<T> rear;
    private Node<T> front;
    Queue<Animal> animalsQueue = new Queue<>();

public void enequeue(Animal animal){
    animalsQueue.enqueue(animal);
}

public Object dequeue(String pref){
    T kind;
    if(front.value == pref){
        kind= front.value;
        front=front.next;
        return kind;
    }
    Node<T> temp =front;
    while (temp.next != null && temp.next.value != pref){
        temp=temp.next;
    }
    if (temp.next != null){
       kind = temp.next.value;
        temp.next = temp.next.next;
        return kind;
    }
    return null;
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
