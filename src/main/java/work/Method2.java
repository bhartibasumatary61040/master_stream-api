package work;
import java.util.List;
import java.util.stream.Collectors;
public class Method2 {

    public static void main(String[] args) {
        List<String> cityNames = List.of("Agra","Agartala","Bangalore", "Pune","Punjab");
        List<String> newCityNames = cityNames.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newCityNames);

        List<String> GadiNames =  List.of("AUDI", "AUTO","ALLA","OLLA","DHOLLA","ABC");
        List<String> NewGadiNews= GadiNames.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(NewGadiNews);

        List<Integer> numbers= List.of(2,3,4,5,7,89,1,5,44);
        List<Integer> newNumbers= numbers.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

        Integer integer = numbers.stream().min((X,Y)-> X.compareTo(Y)).get();
        System.out.println( "Mini" +integer);

        Integer integer1 = numbers.stream().max((X,Y)->Y.compareTo(X)).get();
        System.out.println(integer1);

    }
}

