package queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stack.Stack;

public class QueueTest {
    @Test void testisEmpty_returnsTrueEmptyQueue(){
        Queue q = new Queue();
        boolean result = q.isEmpty();
        Assertions.assertEquals(true,result);
    }
    @Test void testisEmpty_returnsFalseNotEmptyQueue(){
        Queue q = new Queue();
        q.enqueue(10);
        boolean result = q.isEmpty();
        Assertions.assertEquals(false,result);
    }
    @Test void testDequeue_returnsFirstValueEnequed(){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        Object result = q.dequeue();
        Assertions.assertEquals(10,result);
    }
    @Test void testEnequeue_returnsValuesOfQueues(){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        String result =q.toString();
        Assertions.assertEquals("10->20->30->null",result);
    }
    @Test void testPeek_returnsFirstValueOfQueue(){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        Object result =q.peek();
        Assertions.assertEquals(10,result);
    }
}
