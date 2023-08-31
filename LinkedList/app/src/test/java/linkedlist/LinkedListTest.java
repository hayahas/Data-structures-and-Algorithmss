package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test void returnsEmptyLinkedList(){
        App sut = new App();
        LinkedList ll =new LinkedList();

        Assertions.assertEquals("Null", ll.toString());
    }

    @Test void insertNodeToHeadOfLinkedlist(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(10);


        String result = ll.toString();

        Assertions.assertEquals("{10}->Null", result);

    }

    @Test void checkHeadPointer(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(10);
        int result = ll.head.value;
        Assertions.assertEquals(10, result);


    }

    @Test void insertMultipleNodeToHeadOfLinkedlist(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(10);
        ll.insert(15);
        ll.insert(20);
        ll.insert(25);
        ll.insert(30);

        String result = ll.toString();

        Assertions.assertEquals("{30}->{25}->{20}->{15}->{10}->Null", result);

    }

    @Test void includes_checkIfValueIncludedInLinkedlist(){

        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(10);
        ll.insert(15);
        ll.insert(20);
        ll.insert(25);
        ll.insert(30);

        boolean result = ll.includes(5);
        Assertions.assertEquals(false , result);
        result = ll.includes(10);
        Assertions.assertEquals(true , result);
    }

    @Test void insertNodeIntoTail(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insertToTail(1);
        ll.insertToTail(2);
        ll.insertToTail(3);
        ll.insertToTail(4);
        ll.insertToTail(5);

        String result = ll.toString();

        Assertions.assertEquals("{1}->{2}->{3}->{4}->{5}->Null", result);

    }


    @Test void insertBeforeSpecificValue(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);

        ll.insertBefore(5,0);

        String result = ll.toString();
        Assertions.assertEquals("{1}->{2}->{3}->{4}->{0}->{5}->Null", result);

    }
    @Test void insertAfterSpecificValue(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);

        ll.insertAfter(4,0);

        String result = ll.toString();
        Assertions.assertEquals("{1}->{2}->{3}->{4}->{0}->{5}->Null", result);

    }
//    @Test void reverseLinkedList(){
//        App sut = new App();
//        LinkedList ll =new LinkedList();
//        ll.insert(5);
//        ll.insert(4);
//        ll.insert(3);
//        ll.insert(2);
//        ll.insert(1);
//
//        ll.reverse();
//        String result = ll.toString();
//        Assertions.assertEquals("{5}->{4}->{3}->{2}->{1}->Null", result);
//
//    }

    @Test void returnsValueOfKthIndex(){
        App sut = new App();
        LinkedList ll =new LinkedList();
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);

        ll.reverse();

        int result = ll.kthValue(3);
        Assertions.assertEquals(4, result);

    }@Test
    void returns2ZippedLinkedlist(){
        App sut = new App();
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(1);

        LinkedList list2 = new LinkedList();
        list2.insert(4);
        list2.insert(9);
        list2.insert(5);


        LinkedList result = list.zipLists(list,list2);
        Assertions.assertEquals("{1}->{5}->{3}->{9}->{2}->{4}->Null", result.toString());

    }
}
