package merge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMergeSort(){

        MergeSort mergeSort = new MergeSort();

        int[] arr= {8,4,23,42,16,15};
        int [] result =mergeSort.sort(arr);
        Assertions.assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(result));
    }
}
