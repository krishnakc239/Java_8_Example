package collection_api_improvements;

import java.util.*;

public class CollectionNewMethods {

    public static void main(String[] args) {
        //forEachRemaining()
        Iterator iterator = Arrays.asList("Smith","Cris","John").iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Smith")) {
                break;
            }
        }
        System.out.println("..............forEachRemaining() output.......");
        iterator.forEachRemaining(System.out::println);

        //removeIf()
        List<Integer> employeAgeList = new ArrayList(){{
            add(35);
            add(45);
            add(25);
            add(20);
        }};
        employeAgeList.removeIf(
                age -> age > 30
        );
        System.out.println("Employees below the age of 30 are ......");
        employeAgeList.forEach(System.out::println);

        //.........Spliterator interface...............
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        Spliterator<String> s = list.spliterator();

        /*tryAdvance: The method takes a Consumer that’s used to consume elements of the Spliterator
        one by one sequentially and returns false if there’re no elements to be traversed.*/
        s.tryAdvance(System.out::println);

        //These methods return the size of the remaining elements to traverse.
        System.out.println(s.estimateSize());
        System.out.println(s.getExactSizeIfKnown());
        System.out.println(s.characteristics());

    }
}
