package queue;

import queue.animalShell.Animal;

public class Node<T> {

    public T value;
    public Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = null;
    }

    public Node(Animal animal) {
    }
}