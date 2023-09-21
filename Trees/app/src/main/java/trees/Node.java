package trees;

public class Node<T> {

    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this.value = value;
    }
    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node() {

    }
}