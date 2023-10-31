package hashtable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashTableTest {
    HashTable hashTable = new HashTable<>(10);
    @Test
    public void testSetToHashTable(){

        hashTable.set(1,"hi");
        hashTable.set(2,"hi2");
        hashTable.set(6,"hello");

        assertEquals("hi",hashTable.get(1));
        assertEquals("hi2",hashTable.get(2));
        assertEquals("hello",hashTable.get(6));

    }
    @Test
    public void testGetFromHashTable(){

        hashTable.set(1,"hi");
        hashTable.set(2,"hi2");
        hashTable.set(6,"hello");

        assertEquals("hi",hashTable.get(1));
        assertEquals("hi2",hashTable.get(2));
        assertEquals("hello",hashTable.get(6));
        assertEquals(null,hashTable.get(10));


    }
    @Test
    public void testHashKey(){


        assertEquals(8,hashTable.hash(8));
        assertEquals(0,hashTable.hash(10));
        assertEquals(6,hashTable.hash(16));
        assertEquals(3,hashTable.hash(23));

    }
    @Test
    public void testKeysInHashTable(){



        hashTable.set(1, "One");
        hashTable.set(2, "Two");
        hashTable.set(3, "Three");
        hashTable.set(6, "Eleven");

        List<Integer> keys = new ArrayList<>();
        keys.add(1);keys.add(2);keys.add(3);keys.add(6);
        assertEquals(keys,hashTable.keys());



    }


    @Test
    public void testHasInHashTable(){

        hashTable.set(1,"hi");
        hashTable.set(2,"hi2");
        hashTable.set(6,"hello");

        assertEquals(true,hashTable.has(1));
        assertEquals(true,hashTable.has(2));
        assertEquals(true,hashTable.has(6));
        assertEquals(false,hashTable.has(9));


    }

}