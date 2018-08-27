package fucntional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {
    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Predicate<String> predicateString = s -> s.equalsIgnoreCase("Ram");
        System.out.println(predicateString.test("Hari"));


        Consumer<String> consumer = PredicateExample::printName;
        consumer.accept("Consumer");

        //Supplier instance with lambda expression
        Supplier<String> helloStrSupplier = () -> "Hello from Supplier!! ";
        String helloStr = helloStrSupplier.get();
        System.out.println(helloStr);

        Function<Integer, String> function = (t) -> {
            if (t % 2 == 0) {
                return t+ " is even number";
            } else {
                return t+ " is odd number";
            }
        };

        System.out.println(function.apply(5));
        System.out.println(function.apply(8));
    }


}
