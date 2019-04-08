package data_structures;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = reverseRescusively("hello");
        System.out.println("reversed string =========="+ reverse);
    }

    public static String reverseRescusively(String str){
        if (str.length() <2){
            return str;
        }
        System.out.println("str.substring(1)==="+ str.substring(1));
        String recursiveOutput = reverseRescusively(str.substring(1))+str.charAt(0);
        System.out.println("recursivedOutput ===="+ recursiveOutput);
        return reverseRescusively(str.substring(1))+ str.charAt(0);
    }
}
