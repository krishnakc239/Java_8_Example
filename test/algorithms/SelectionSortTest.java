package algorithms;

import data_structures.algorithms.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSort() {
        SelectionSort s_sort = new SelectionSort();
        assertArrayEquals(new int[]{1,3,5,12,14}, s_sort.selectionSort(new int[]{1,12,3,14,5}));
    }
}