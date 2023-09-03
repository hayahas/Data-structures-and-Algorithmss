package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PseudoQueueTest {

PseudoQueue pq=new PseudoQueue();


    @Test
    public void isEmpty_returnsTrueIfQueueisEmpty(){
        boolean result= pq.isEmpty();
        Assertions.assertEquals(true,result);
    }
    @Test
    public void isEmpty_returnsFalseIfQueueisNotEmpty(){
        pq.enqueue(1);
        boolean result= pq.isEmpty();
        Assertions.assertEquals(false,result);
    }

    @Test
    public void enqueue_insertsValuesToQueue(){
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.enqueue(4);
        String result= pq.toString();
        Assertions.assertEquals("4->3->2->1->null",result);
    }
    @Test
    public void denqueue_dequeuesValuesfromQueue(){
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.enqueue(4);
        int result= pq.dequeue();
        Assertions.assertEquals(1,result);
    }
}
