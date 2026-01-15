package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        Stream<Object> emptyStream = Stream.empty();

        String names [] = {"Jojo", "Uttam", "Ankit", "Pratik", "Jojjooo"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e-> {
            System.out.println(e);
        });

       Stream<Object> streamBuilder = Stream.builder().build();

       //new

       IntStream stream =  Arrays.stream(new int[]{2,4,5,68,999,00,77,54,22245,67,88});
       stream.forEach(e-> {
           System.out.println(e);
       });

       //5


        List<Integer> List2 = new ArrayList<>();
        List2.add(12);
        List2.add(34);
        List2.add(23);
        List2.add(178);
        List2.add(78);
        List2.add(120);

        Stream<Integer> stream2 = List2.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });

    }
}
