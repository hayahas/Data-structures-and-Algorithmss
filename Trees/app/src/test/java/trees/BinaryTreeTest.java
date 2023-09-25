package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeTest {
    BinarySearchTree bst = new BinarySearchTree();


    @Test
    public void testGetMaxReturnsTheMaximumValueInTree(){
        bst.insert(5);
        bst.insert(3);
        bst.insert(10);
        bst.insert(15);
        bst.insert(20);
        bst.insert(25);

        Assertions.assertEquals(25,bst.getMax());

    }

    @Test
    public void testGetMinReturnsTheMinimumValueInTree(){
        bst.insert(5);
        bst.insert(3);
        bst.insert(20);
        bst.insert(15);
        bst.insert(10);
        bst.insert(25);
        Assertions.assertEquals(3,bst.getMin());

    }


    @Test
    public void breadthTraverseTest(){
        bst.insert(5);
        bst.insert(3);
        bst.insert(20);
        bst.insert(15);
        bst.insert(10);
        bst.insert(25);

        String result= String.valueOf(bst.breadthFirst());

        Assertions.assertEquals("[5, 3, 20, 15, 25, 10]",result);
    }


    @Test
    public void testFizzBuzzTree() {

        BinaryTree<Integer> integerTree = new BinaryTree<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(20);
        bst.insert(15);
        bst.insert(23);

        BinaryTree<String> fbTree = integerTree.fizzBuzzTree(bst);

        String[] expected = {"Fizz","Buzz", "FizzBuzz", "Buzz", "23"};


        List<String> actual = new ArrayList<>();
        integerTree.traverseTree(fbTree.root, actual);


        String[] actualArray = actual.toArray(new String[0]);


        assertArrayEquals(expected, actualArray);
    }



}
