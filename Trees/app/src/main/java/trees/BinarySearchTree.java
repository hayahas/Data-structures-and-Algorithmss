package trees;


public class BinarySearchTree <T extends Comparable< T>> extends BinaryTree {



    public Node<T> getRoot() {
        return root;
    }

    public BinarySearchTree(){
        super();
    }
    public boolean isEmpty() {
        return root == null;
    }

public void insertHelper(Node<T> temp, T value) {
    if (isEmpty()) {
        Node<T> newNode = new Node<>();
        newNode.value = value;
        newNode.left = newNode.right = null;
        root = newNode;
    } else {
        if (value.compareTo(temp.value) < 0) {
            if (temp.left == null) {
                Node<T> newNode = new Node<>();
                newNode.value = value;
                newNode.left = newNode.right = null;
                temp.left = newNode;
            } else {
                insertHelper(temp.left, value);
            }
        } else {
            if (temp.right == null) {
                Node<T> newNode = new Node<>();
                newNode.value = value;
                newNode.left = newNode.right = null;
                temp.right = newNode;
            } else {
                insertHelper(temp.right, value);
            }
        }
    }
}

    public void insert(T value){

            insertHelper(root,value);

    }

    public boolean containsHelper(Node<T> temp, T value){

        if (temp == null) {
            return false;
        }

        if(value.equals(temp.value))
            return true;

        if(value.compareTo(temp.value) < 0){
            if(temp.left != null && temp.left.value.equals(value)){
                return true;
            }else{
               return containsHelper(temp.left,value);
            }
    }
        else{
            if(temp.right != null && temp.right.value.equals(value)){
                return true;
            }else{
                return  containsHelper(temp.right,value);
            }
        }


    }

    public boolean contains(T value){

        return containsHelper(root,value);
    }





}

