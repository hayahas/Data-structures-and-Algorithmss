package trees;

public class Node<T> {

    T value;
    Node left;
    Node right;

    public Node(T value) {
        this.value = value;
    }
    public Node(T value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node() {

    }
}