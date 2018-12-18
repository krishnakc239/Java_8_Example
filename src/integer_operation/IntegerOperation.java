package integer_operation;

import java.util.Arrays;

public class IntegerOperation {
    public static void main(String[] args) {

//        int rev = getReversedInt(123);
//        System.out.println("rsult ="+ rev);

//        int[] a = {10,2,5,8,9};
//        int secon_largets = get2ndLarget(a);
//        System.out.println("second larget integer is=="+ secon_largets);

        String revstr = getReverseString("HELLO");
        System.out.println("reversed str =="+ revstr);
    }

    /**reverse an integer*/
    public static int getReversedInt(int number){
        int rev =0;
        int rem =0;
        //1234
        while (number >0){
            rev = rev*10 + number % 10;
            number = number/10;

        }
        return rev;
    }

    /**Write a java program to find second largest number in an array of numbers*/
    public static int get2ndLarget(int[] arr){
        int[] newArr = arr;
         Arrays.sort(newArr);


        return  newArr[newArr.length-2];

    }
    /** reverse string with recursive function*/
    public static String getReverseString(String str){
        System.out.println(str);
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }
        return getReverseString(str.substring(1)) + str.charAt(0);
    }
}
