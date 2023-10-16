package insertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertingSortedTest {

    InsertingSorted i = new InsertingSorted();

 @Test
    public void givenRandomArray_SortUsingInsertionSort() throws Exception {
        int[] arr = {8, 4, 23, 42, 16, 15};

        i.insertionSort(arr);
        int[] expected = {4,8,15,16,23,42};
        Assertions.assertArrayEquals(expected,arr);
    }



}