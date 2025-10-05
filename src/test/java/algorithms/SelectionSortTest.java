package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    void testNormalArray() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }
}
