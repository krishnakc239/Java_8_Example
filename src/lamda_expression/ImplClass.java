package lamda_expression;

public class ImplClass implements FunctionalInterface1{

//    @Override
//    public void display() {
//        System.out.println("display method!!!!!!");
//    }

//    @Override
//    public void getValue() {
//        System.out.println("default method from impl class");
//    }

    public static void main(String[] args) {
        ImplClass ip = new ImplClass();
        ip.turnOnn();
        ip.turnOFF();
//        ip.getValue();
        FunctionalInterface1.printName();
        String name = FunctionalInterface1.getName();
        System.out.println("name from interface static method=="+ name);

    }
}
