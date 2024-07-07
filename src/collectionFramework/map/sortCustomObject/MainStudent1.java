package collectionFramework.map.sortCustomObject;

import java.util.*;

public class MainStudent1 {
    public static void main(String[] args) {

        Student1 student = new Student1(1, "abcd", 200);
        Student1 student1 = new Student1(4, "efge", 231);
        Student1 student12 = new Student1(2, "ijk", 100);
        Student1 student13 = new Student1(3, "lmnop", 200);
        List<Student1> list = Arrays.asList(student, student1, student12, student13);

//        Hashcode and equals
        System.out.println(student.equals(student1));
        System.out.println(student + " \n " + student1+ " \n " + student12);
        list.stream().forEach(System.out::println);

//        Comparable sorting
//        Collections.sort(list);
//        list.forEach(System.out::println);

//        Comparator sorting

//        our custom sorting using comparator
        list.sort(new StudentMarksComparator());
        list.sort(new StudentNameComparator());
        list.sort(Comparator.comparing(Student1::getName).reversed());
        list.forEach(System.out::println);

//        using stream api
        list.stream().sorted(Comparator.comparing(Student1::getMarks).reversed().thenComparing(Comparator.comparing(Student1::getName))).forEach(System.out::println);

    }
}