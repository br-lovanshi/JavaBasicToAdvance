import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        
       Predicate<Integer> predicate = i -> i < 10;
       System.out.println(predicate.test(39));

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(230);
        list.add(24);
        list.add(90);
        list.add(8);
        
        list.removeIf(i -> i <= 10);
        System.out.println(list);
    }
}

// Predicate is a functional interface that have one method(Test) that return boolean value;

// Java 8 collection interface have one method removeIf(Predicate p) based on condition it will
// remove element from collection 
