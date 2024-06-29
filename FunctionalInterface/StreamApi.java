package FunctionalInterface;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Brajesh", 100f));
        list.add(new Student(3, "Vikas", 200f));
        list.add(new Student(4, "Laksh", 200f));
        list.add(new Student(2, "Shiddharth", 300f));

        // list.stream().forEach(System.out::println);

        list.stream().filter(st -> st.getMakrs() >= 200f);
        // .forEach(st -> System.out.println(st.getName));

        List<Student> list1 = list.stream()
                .filter(st -> st.getMakrs <= 100f)
                .collect(Collectors.toList());

        List<Student> addGrassMarks = list.stream()
                .map(st -> st.getMakrs + 5)
                .collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // sort the students based on their marks
        List<Student> sortStudentByMarks = list.stream()
                .filter(student -> Collections.sort(student.getMarks() > student.getMarks()))
                .collect(Collectors.toList());
        sortStudentByMarks.stream().forEach(s -> System.out.println(s));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

    }
}