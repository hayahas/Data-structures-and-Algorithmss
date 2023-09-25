/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static <T> void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println(bst.contains(8)); // true
        System.out.println(bst.contains(10)); // false

        System.out.println("Max value : " + bst.getMax()); // 8
        System.out.println("Min value : " + bst.getMin()); // 2

        System.out.println(bst.breadthFirst());



    }
}
