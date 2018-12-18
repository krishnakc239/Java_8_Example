package data_structures;

public class SortingAlgorithms {
    /**
     * 1.Bubble sort  Time complexity Ο(n2), Space Complexity: O(1)
     * This algorithm is not suitable
     * for large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.*/
    public int[] getBubbleSortedAray(int[] arr_input){
        int len = arr_input.length-1;
        boolean check_already_sorted ; //2,4,1,6
        for (int i=0;i<len;i++){
            check_already_sorted =false;
            for (int j=0;j <len -i;j++){ // len-i means each iteration shift largest value to last index so len need to decreases
                if (arr_input[j] > arr_input[j+1]){
                    int temp = arr_input[j];
                    arr_input[j] = arr_input[j+1];
                    arr_input[j+1] = temp;
                    check_already_sorted = true;
                }
            }
            if (check_already_sorted == false){//optimization to check if array already sorted
                break;
            }
        }
        return arr_input;

    }
    // rescursive method
    public void getBubbleSortRecursively(int[] arr, int n){
        if (n ==0){
            return;
        }
        for (int i=0;i< n -1;i++){
            if (arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        getBubbleSortRecursively(arr,n-1);
    }

    /**
     * 2. Insertion Sort Ο(n2)
     *
     * This algorithm is not suitable for large data sets as
     * its average and worst case complexity are of Ο(n2), where n is the number of items.*/
    /*ALGORITHM
    *   Step 1 − If it is the first element, it is already sorted. return 1;
        Step 2 − Pick next element
        Step 3 − Compare with all elements in the sorted sub-list
        Step 4 − Shift all the elements in the sorted sub-list that is greater than the
                 value to be sorted
        Step 5 − Insert the value
        Step 6 − Repeat until list is sorted
        */

    /**Note:
     * Even though insertion sort is efficient, still, if we provide an already sorted array to the insertion sort algorithm,
     * it will still execute the outer for loop,
     * thereby requiring n steps to sort an already sorted array of n elements,
     * which makes its best case time complexity a linear function of n.[Big-omega]: O(n) better than other sort algorithms*/

    public int[] getInsertionSortedArray(int[] arr){
        int i,j,key; //3,4,2,3,7,5
        for (i=1;i<arr.length;i++){
            j=i;
            System.out.println("i ="+ i);
            while (j>=0 && arr[j-1] > arr[j]){
                System.out.println( arr[j-1] +">"+ arr[j]);
                key = arr[j];
                arr[j]= arr[j-1];
                arr[j-1] = key;
                System.out.println("key = " + key);

                j--;
                System.out.println("j ="+ j);
            }
        }
        return  arr;
    }

    /**3. Selection Sort time complexity Ο(n2) , space complexity O(1)
     * */
    //ALGORITHM
    /**
     * Step 1 − Set MIN to location 0
     Step 2 − Search the minimum element in the list
     Step 3 − Swap with value at location MIN
     Step 4 − Increment MIN to point to next element
     Step 5 − Repeat until list is sorted
     */
    public int[] getSelectionSortArray(int[] arr){
        for (int i=0;i< arr.length -1 ;i++){ // Here < len-1 means to adjust j=i+1
            int min_index = i;//3,1,4
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]< arr[min_index]){
                    min_index =j;
                }
            }
            int temp = arr[min_index]; // min value -> temp
            arr[min_index] = arr[i];  // shift current element to min index postion
            arr[i] = temp; // shift back min value to current i position

        }
        return arr;
    }

    /**4 Merge Sort Algorithm [Ο(n log n) in all cases],
     * ->Merge sort first divides the array into equal halves and then combines them in a sorted manner.
     * ->Merge Sort follows the rule of Divide and Conquer to sort a given set of numbers/elements, recursively, hence consuming less time.
     *
     * In Merge Sort, the given unsorted array with n elements, is divided into n subarrays, each having one element,
     * because a single element is always sorted in itself.
     * Then, it repeatedly merges these subarrays, to produce new sorted subarrays,
     * and in the end, one complete sorted array is produced.*/


}
