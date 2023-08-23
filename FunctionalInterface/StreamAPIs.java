package CollectionFramework.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIs {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(12,2,3,4,5,6,7);
        int sum = list1.stream().filter(i -> i %2 == 0).mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

        List<Student1> student = new ArrayList<>();
        student.add(new Student1(1,"Brajesh",100));
        student.add(new Student1(2,"Vicky",88));
        student.add(new Student1(3,"Ram",44));
//        System.out.println(student);

//        forEach method
        student.stream()
               .forEach(System.out::println);
//        print marks
//        student.stream()
//                .forEach(st->System.out.println(st.getMarks() +"\n"));

//        get the student whos marks is greator then 90 using stream
//       student.stream().filter(st -> st.getMarks() >90 )
//                .forEach(System.out::println);
        List<Student1> newList = student.stream().filter(st -> st.getMarks() > 90)
                        .collect(Collectors.toList());
            newList.forEach(System.out::println);

//            add grass marks with student marks
//        List<Student1> newList1 = student.stream().filter(st -> st.getMarks() > 90)
//                .collect(Collectors.toList())
//                .map( s->s.getMarks() + 5);

    }
}
