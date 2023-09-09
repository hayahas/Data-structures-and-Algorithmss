package queue.animalShell;

import queue.Node;
import queue.Queue;



public class AnimalShelter<T> {
    private Node<Animal> rear;
    private Node<Animal> front;
    Queue<Animal> animalsQueue ;

    public AnimalShelter() {
        animalsQueue =  new Queue<>();
    }
    public boolean isEmpty() {
        return rear == null;
    }
public void enequeue(Animal  animal)
{
    Node<Animal> newNode = new Node<>(animal, null);

    if (rear == null){
        front = newNode;
        rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
    }
}

public String dequeue(String pref) {

    if (pref.equals("dog") || pref.equals("cat")) {
        if (front.value.getSpecies().equals(pref)) {
            Animal a = front.value;
            front = front.next;
            return  a.getSpecies()+ " " + a.getName();
        } else {
            Node<Animal> current = front;
            while (current.next != null && !current.next.value.getSpecies().equals(pref)) {
                current = current.next;
            }

            if (current.next != null) {
                Animal a = current.next.value;
                current.next = current.next.next;
                return a.getSpecies()+ " " + a.getName();
            }
        }
    }
    return null;
}
    @Override
    public String toString() {
        StringBuilder shelter = new StringBuilder("");
        Node<Animal> current = front;
        while (current != null) {
            shelter.append(current.value.getSpecies()).append(" -> ");

            current = current.next;
        }

        shelter.append("null");
        return shelter.toString();
    }


}
