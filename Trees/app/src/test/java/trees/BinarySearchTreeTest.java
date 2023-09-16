package trees;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {

    BinarySearchTree bst = new BinarySearchTree();


    @Test
    public void testInsertMethodtoBinarySearchTree(){
        bst.insert(5);
        bst.insert(3);
        bst.insert(10);
        bst.insert(15);
        bst.insert(20);
        bst.insert(25);

        assertTrue(bst.contains(5));
        assertTrue(bst.contains(3));
        assertTrue(bst.contains(10));
        assertTrue(bst.contains(15));
        assertTrue(bst.contains(20));
        assertTrue(bst.contains(25));

        assertFalse(bst.contains(7));
        assertFalse(bst.contains(12));

    }


    @Test
    public void testContainsMethodInBinarySearchTreeReturnsTrue(){
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        Assertions.assertEquals(true,bst.contains(3));

    }
    @Test
    public void testContainsMethodInBinarySearchTreeReturnsFalse(){
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);

        Assertions.assertEquals(false,bst.contains(10));

    }


}
