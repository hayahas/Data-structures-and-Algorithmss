package trees;

import org.checkerframework.common.value.qual.StringVal;

import java.util.*;

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

    public ArrayList<T> breadthFirst (){

        ArrayList<T> result = new ArrayList<>();

        if(root == null ){
            throw new NullPointerException("Tree is Empty");
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            Node<T> temp =q.poll();
            result.add(temp.value);
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);

        }
        return result;

    }



    public BinaryTree<String> fizzBuzzTree(BinaryTree<Integer> integerTree) {
        BinaryTree<String> fbTree = new BinaryTree<>();
        fbTree.root = fizzBuzzHelper(integerTree.root);
        return fbTree;
    }

    private Node<String> fizzBuzzHelper(Node<Integer> node) {
        if (node == null) {
            return null;
        }

        Node<String> fbNode;
        fbNode = new Node<>(Integer.toString(node.value));

        fbNode.left = fizzBuzzHelper(node.left);

        if (node.value % 3 == 0 && node.value % 5 == 0) {
            fbNode.value = "FizzBuzz";
        } else if (node.value % 3 == 0) {
            fbNode.value = "Fizz";
        } else if (node.value % 5 == 0) {
            fbNode.value = "Buzz";
        }

        fbNode.right = fizzBuzzHelper(node.right);

        return fbNode;
    }

    public void traverseTree(Node<String> node, List<String> result) {
        if (node != null) {
            traverseTree(node.left, result);
            result.add(node.value);
            traverseTree(node.right, result);
        }
    }



}
