package hashtable;

public class Node<T>{

    private int key ;
    private T value ;

    Node<T> next;

    public Node() {
        next = null;
    }
    public Node(int key, T value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
