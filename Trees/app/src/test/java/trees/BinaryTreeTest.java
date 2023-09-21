package trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
}
