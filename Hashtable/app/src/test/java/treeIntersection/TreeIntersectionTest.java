package treeIntersection;

import hashtable.HashTable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersection() {

        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();

        BinarySearchTree<Integer> bst1 = new BinarySearchTree<Integer>();
        bst1.insert(10);
        bst1.insert(15);
        bst1.insert(20);
        bst1.insert(3);
        bst1.insert(7);
        bst1.insert(18);

        BinarySearchTree<Integer> bst2 = new BinarySearchTree<Integer>();

        bst2.insert(11);
        bst2.insert(5);
        bst2.insert(20);
        bst2.insert(1);
        bst2.insert(7);
        bst2.insert(18);

        TreeIntersection t = new TreeIntersection();
        HashTable<Integer> result = t.tree_Intersection(bst1, bst2);

        List<Integer> keys = new ArrayList<>();
        keys.add(2);
        keys.add(4);
        keys.add(5);

          String str ="";
        for(int i=0;i<result.size;i++){
            if(result.get(i) != null)
               str += result.get(i) + " ";
        }


        assertEquals(keys, result.keys());

        assertEquals("7 20 18 ", str);

        assertEquals(true, result.has(2));
        assertEquals(false, result.has(7));


    }
    }
