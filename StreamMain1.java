package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> List1 = List.of(10, 20, 45, 23, 46, 53, 86);

//        Stream<Integer> stream = List1.stream();
//        List<Integer> EvenNums = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(EvenNums);
        List<Integer> Evenums = List1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(Evenums);





    }
}
