import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {

        Consumer<String> consumer = (i) -> {
           
            System.out.println(i);
        };

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(230);
        list.add(24);
        list.add(90);
        list.add(8);
        list.forEach(i -> System.out.println(i));
        consumer.accept("9");
    }
}
// Consuser have one method accept that take one parameter and not return anyting