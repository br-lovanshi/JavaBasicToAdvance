package functionalProgramming.lembdaExpression;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Consumers {
    public static void streamAPIPractise() {
        List<Integer> list = Arrays.asList(1,3,2,1, 3,55, 2, 624, 26, 3, 8);
        
        // find distinct elements
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        long count = list.stream().count();
        // System.out.println(count);
        
        // sort the list using stream
        List<Integer> sortedList = list.stream().sorted().toList();
        // sortedList.stream().forEach(System.out::println);

        // System.out.println(list);
        // list.forEach(System.out::println);
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i + " Is even");
                // .forEach(System.out::println);

        // collect all the odd number
        List<Integer> list2 = list.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        list2.stream()
                .map(i -> i + " Is odd");
                // .forEach(System.out::println);

                
    }

    public static void main(String[] args) {

        Consumer<String> consumer = (i) -> {

        };

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(230);
        list.add(24);
        list.add(90);
        list.add(8);
        // list.forEach(i -> System.out.println(i));
        // consumer.accept("9");

        streamAPIPractise();
    }
}
// Consuser have one method accept that take one parameter and not return
// anyting