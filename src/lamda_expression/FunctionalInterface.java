package lamda_expression;

public interface FunctionalInterface {
    void display();
    default public void getValue(){
        System.out.println("default method !!!!!!!!!!!!!!");
    }



}
