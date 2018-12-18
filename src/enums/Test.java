package enums;

import data_structures.SortingAlgorithms;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        SortingAlgorithms bub_sort = new SortingAlgorithms();
//        int[] arr = {1,4,2,3,7,5};
//        System.out.println("bubble sorted aray!!!!!!!!!"+ Arrays.toString(bub_sort.getBubbleSortedAray(arr)));
//        bub_sort.getBubbleSortRecursively(arr,arr.length);
//        System.out.println("bubble sorted aray recursively !!!!!!!!!"+ Arrays.toString(arr));

//        SortingAlgorithms insert_sort = new SortingAlgorithms();
//        int[] arr = {1,4,2,3,7,5};
//        insert_sort.getInsertionSortedArray(arr);
//        System.out.println("insertion sorted aray  !!!!!!!!!"+ Arrays.toString(arr));

        SortingAlgorithms selection_sort = new SortingAlgorithms();
        int[] arr = {1,4,2,3,7,5};
        selection_sort.getSelectionSortArray(arr);
        System.out.println("selection sorted aray  !!!!!!!!!"+ Arrays.toString(arr));

    }
}
