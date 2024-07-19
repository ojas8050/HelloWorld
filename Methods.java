package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        //List<Integer> names= List.of(923,8213,98213,321,982,97213,123,9823,763,8721,74,93,873,9127,8123);
        List<String> names= List.of("John","Roman","Undertaker","Rock","Goldburg","Jimmy","jay","HHH","Seth","Dean","Shield");
        names.stream()
                .filter(i -> i.startsWith("S"))
                //.collect(Collectors.toList());
                .forEach(System.out::println);
        //System.out.println(Filternames);


        System.out.println("--------------------------------------------------------------");
        //using map function
        List<Integer> numbers=List.of(10,20,30,44,23,54,234,324);
        numbers.stream().map(i->i*i).forEach(i->{
            System.out.println(i);
        });

        System.out.println("--------------------------------------------------------------");

        //Sorting Method in Streams
        //names.stream().sorted().forEach(System.out::println);
        List<String> Sort = names.stream().sorted().collect(Collectors.toList());
        System.out.println(Sort);


        System.out.println("--------------------------------------------------------------");

        Integer min = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min is "+min);

        Integer max = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max is "+max);

    }
}
