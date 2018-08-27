package lamda_expression;

public interface FunctionalInterface1 {
    default void turnOnn(){
        System.out.println("ONN");
    }

    default void turnOFF(){
        System.out.println("OFF");
    }

    static void printName(){
        System.out.println("HEllo Ram");
    }
    static String getName(){
        return "Ram";
    }
}
