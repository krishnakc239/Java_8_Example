package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTermainalOperations {
    public static void main(String[] args) {
        //1.reduce()
        List<String> words = Arrays.asList("RAM", "HARI", "SAMPURNA",
                "SHYAM BAHADUR", "SITA");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()? word1 : word2);

        // Displaying the longest String
        System.out.println("displaying the longest string using reduce method...........");
        longestString.ifPresent(System.out::println);

        // example to get the combined string:
        // String array
        String[] array = { "RAM", "HARI", "SITA" };

        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + "-" + str2);

        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println("sombined string using reduce method........ "+String_combine.get());
        }
        //2.count
        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);

        System.out.println("count() output...Number of elements in stream="+numbers1.count());

        //3.forEach()

        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        System.out.println("forEach() method output...............");
        numbers2.forEach(i -> System.out.print(i+","));

        //4.match()
        //anyMatch()
        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4));

        //allMatch()
        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10));

        //noneMatch()
        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println("Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10));

        //5.findFirst()
        System.out.println(".................findFirst() example....................");
        Stream<String> names4 = Stream.of("RAM","HITESH","HARI","HARRY", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("H")).findFirst();
        if(firstNameWithD.isPresent()){
            System.out.println("First Name starting with H="+firstNameWithD.get());
        }
        //6.toArray()
        Object[] objects = Stream.of(1, 2).toArray();
        System.out.println("converted array lenmgth===="+ objects.length);

        //7.collect()
        System.out.println("..........collect example................");

        List<String> stringList = Stream.of("one", "two", "two", "one")
                .collect(Collectors.toList());
        System.out.println("stream converted ot list ===="+ stringList);

        Set<String> stringSet = Stream.of("one", "two", "two", "one")
                .collect(Collectors.toSet());
        System.out.println("stream converted ot set ===="+ stringSet);

        //8.min() & max()
        OptionalInt minimum = IntStream.of(1,2,3).min();
        OptionalInt maximum = IntStream.of(1, 2, 3,4).max();
        System.out.println("min and max int values are ===="+ minimum.getAsInt() + " & "+ maximum.getAsInt());

        //9.count()
        long stringCount = Stream.of("one","two","three").count();
        System.out.println("count in stream of Stream==="+ stringCount);

        long intCount = Stream.of(1,2,3,4,5).count();
        System.out.println("count in stream of integers==="+ intCount);
    }
}
