package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class GeneratingStream {
    public static void main(String[] args) {
        //1. Stream.of()
        Stream<Integer> stream = Stream.of(1,2,3,4);
        //stream.forEach(System.out::println);

        //2.stream() & parallelstream()
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<5; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();
        System.out.println("............sequential streams output..............");
        sequentialStream.forEach(System.out:: println);
        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();
        System.out.println("............parallel streams output..............");

        parallelStream.forEach(System.out:: println);

        //3.Stream.iterate() & Stream.generate()
        System.out.println("............stream.generate() example ..............");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);


        System.out.println("............stream.iterate() example ..............");

        Stream.iterate(2, (Integer n) -> n*n)
                .limit(5)
                .forEach(System.out::println);

        //4.Arrays.stream() and String.chars()
        System.out.println("............Arrays.stream() example ..............");
        String[] array = {"a", "b", "c", "d", "e"};

        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(x -> System.out.println(x));
        System.out.println("............String.chars() example ..............");

        IntStream charstream = "abc".chars();
        charstream.forEach(x -> System.out.println(x));

        //stream conversion to collections( list , set , map)
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println("arrays in list==="+ intList); //prints [1, 2, 3, 4]

        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println("arryas in map===="+ intMap); //prints {1=11, 2=12, 3=13, 4=14}

        intStream = Stream.of(1,2,3,4);
        Integer[] intArray = intStream.toArray(Integer[]::new);
        System.out.println("array of integrs from stream=="+ Arrays.toString(intArray)); //prints [1, 2, 3, 4]



    }


}
