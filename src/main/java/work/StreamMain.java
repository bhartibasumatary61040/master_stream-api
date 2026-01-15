package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        // create a list and filter all even number from list

       List<Integer> List1 =  List.of(2,4,50,21,22,67,99);
         List<Integer> List2 = new ArrayList<>();
         List2.add(12);
        List2.add(34);
        List2.add(23);
        List2.add(178);
        List2.add(78);
        List2.add(120);

        List<Integer> List3 = Arrays.asList(23,45,33,57,555,66,778,90);

        //list1

        List<Integer> listEven = new ArrayList<>();
        for (Integer i : List1){

            if (i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(List1);
        System.out.println(listEven);


       Stream<Integer> stream =  List1.stream();
      List<Integer> newList =  stream.filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

       List<Integer> newList1 =  List1.stream().filter(i -> i> 10).collect(Collectors.toList());
        System.out.println(newList1);

    }
}
