
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,5,9,3,0,13,5,2,99,13, 25);
//        numList.stream().forEach(System.out::println);
//        Filter even numbers from a list and collect into a new list.
        List<Integer> evenNumList = numList.stream().filter(num -> num %2 == 0).collect(Collectors.toList());
        int evenNumCount = (int)evenNumList.stream().filter(num -> num < 9).count();
        List<Integer> numList1 = numList.stream().filter(num -> num > 10).sorted().collect(Collectors.toList());
        numList1.stream().distinct().forEach(System.out::println);
        int max =  numList.stream().reduce((num1, num2) -> num1 > num2? num1: num2).get();
        System.out.println("Max: " + max);
        int max1 = numList.stream().max(Integer::compare).get();
        System.out.println("Max1: " + max1);
        // Optional
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Empty hai"));

    }
}
