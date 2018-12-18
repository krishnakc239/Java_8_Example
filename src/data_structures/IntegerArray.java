package data_structures;

public class IntegerArray {
    public static void main(String[] args) {
        /**Check if an array contains all elements of a given range*/
        int[] a = new int[]{1,3,4,6,7,8,9};
        boolean result = checkArrayContainsRange(a);
        System.out.println("result =="+ result);
    }

    public  static boolean checkArrayContainsRange(int[] arr){
        int min = 4;
        int max =8;
        boolean check = false;
        for (int i = min;i<=max;max++){
            for (int j =0;j<arr.length-1;j++){
                if ((arr[i] > min) && (arr[i] < max)){
                    check = true;
                }
            }
        }
        return check;
    }
}
