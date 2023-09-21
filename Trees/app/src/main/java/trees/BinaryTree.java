package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    public ArrayList<T> inOrder (Node<T> temp, ArrayList<T> result){

    if (root == null){
        throw new NullPointerException("Tree is Empty");
    }

    if(temp != null){
        inOrder(temp.left,result);
        result.add(temp.value);
        inOrder(temp.right,result);
    }
        return result;
    }

    public ArrayList<T> postOrder (Node<T> temp, ArrayList<T> result){

       if(root == null ){
           throw new NullPointerException("Tree is Empty");
       }

       if(temp != null){
           postOrder(temp.left,result);
           postOrder(temp.right,result);
           result.add(temp.value);
       }
       return result;
    }

    public T getMax(){
        if (root == null) {
            throw new NullPointerException("Tree is empty, cannot find maximum.");
        }
        Node<T> temp = root;
        while(temp.right != null){
            temp=temp.right;
        }
        return temp.value;
    }

    public T getMin(){
        if (root == null) {
            throw new NullPointerException("Tree is empty, cannot find minimum.");
        }
        Node<T> temp = root;
        while(temp.left != null){
            temp=temp.left;
        }
        return temp.value;
    }



}
