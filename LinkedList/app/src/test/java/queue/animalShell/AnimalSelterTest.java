package queue.animalShell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import queue.Node;
import queue.Queue;

public class AnimalSelterTest {

    AnimalShelter as = new AnimalShelter();

    @Test
    void testisEmpty_returnsTrueEmptyQueue(){

        boolean result = as.isEmpty();
        Assertions.assertEquals(true,result);
    }
    @Test
    void testisEmpty_returnsFalseIfQueueNotEmpty(){
        Animal dog = new Animal("dog", "Buddy");
        as.enequeue(dog);
        boolean result = as.isEmpty();
        Assertions.assertEquals(false,result);
    }
    @Test void testEnequeue_returnsAnimalsInQueues(){
        Animal cat = new Animal("cat", "Fluffy");
        Animal dog = new Animal("dog", "Buddy");
        as.enequeue(cat);
        as.enequeue(dog);
        String result = as.toString();
        Assertions.assertEquals("cat -> dog -> null",result);
    }

    @Test void testDequeue_returnsNameOfDequeudAnimal(){
        Animal cat = new Animal("cat", "Fluffy");
        Animal dog = new Animal("dog", "Buddy");
        as.enequeue(cat);
        as.enequeue(dog);
        String result = as.dequeue("dog");
        Assertions.assertEquals("Buddy",result);
    }

}
