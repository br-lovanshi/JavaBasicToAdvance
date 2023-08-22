package FunctionalInterface;

import java.util.*;

public class StreamApi{

    public static void main(String[] args){

        Student st = new Student();

        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"Brajesh",100));
        list.add(new Student(3,"Vikas",200));
        list.add(new Student(4,"Laksh",200));
        list.add(new Student(2,"Shiddharth",300));

        list.stream().forEach(System.out::println);

        list.stream().filter(st -> st.getMakrs() >=200)
                    .forEach(st -> System.out.println(st.getName));

        List<Student> list1 = list.stream().+
                                  .filter(st -> st.getMakrs <=100)
                                  .collect(Collector.toList());            
    }
}