package data_structures.algorithms;

public class SelectionSort {

    public  int[] selectionSort(int[] inputArr){
        for (int i=0; i< inputArr.length -1;i++){
            int minIndex =i;
            for (int j= i+1;j< inputArr.length; j++){
                if (inputArr[minIndex]>inputArr[j]){
                    minIndex =j;
                }
            }

            int temp = inputArr[i];
            inputArr[i]= inputArr[minIndex];
            inputArr[minIndex]= temp;
        }
        return inputArr;
    }


}
