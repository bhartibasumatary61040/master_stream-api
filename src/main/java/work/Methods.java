package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {


        //filter(predicate)// boolean value function

        List<String> names= List.of("Aman ","Ankit ","jadow", "Abhinav","Pratik");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer>numbers =  List.of(23,4,555,67,88,100,4,7,2);
        List<Integer> newNumbers = numbers.stream().map(i-> i+i).collect(Collectors.toList());
        System.out.println(newNumbers);

        names.stream().forEach(System.out::println);

        newNames.stream().forEach(System.out::println);

        // sort

        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println( "Min" + integer);

        Integer integer2 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max"+ integer2);


    }
}
