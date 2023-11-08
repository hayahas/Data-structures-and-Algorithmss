package treeIntersection;

import java.util.ArrayList;

public class BinaryTree<T> {

    Node<T> root;

    public ArrayList<T> preOrder(Node<T> temp, ArrayList<T> result) {
        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }
        if (temp != null) {
            result.add(temp.value);
            preOrder(temp.left, result);
            preOrder(temp.right, result);
        }
        return result;
    }


    public ArrayList<T> inOrder(Node<T> temp, ArrayList<T> result) {

        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }

        if (temp != null) {
            inOrder(temp.left, result);
            result.add(temp.value);
            inOrder(temp.right, result);
        }
        return result;
    }

    public ArrayList<T> postOrder(Node<T> temp, ArrayList<T> result) {

        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }

        if (temp != null) {
            postOrder(temp.left, result);
            postOrder(temp.right, result);
            result.add(temp.value);
        }
        return result;
    }
}