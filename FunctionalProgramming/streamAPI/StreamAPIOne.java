import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIOne {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("one1");
        al.add("one2");
        al.add("one3");
        // System.out.println(al);
        // al.forEach(i -> System.out.println(i));
        // al.stream().forEach(i ->System.out.println(i));

        // filter string whos length is greater than 4
        al.stream().filter(i -> i.length() > 3).forEach(i -> System.out.print(i + " \n"));

        // filter and create new list
        List<String> newList = al.stream().filter(i -> i.length() <= 3).collect(Collectors.toList());
        newList.stream().forEach(i -> System.out.println(i));

        // add greeting in list string
        al.stream().map(i -> "Hello  " + i).forEach(i -> System.out.println(i));

        // create new list by addint it
       List<String> list2 =  al.stream().map(i -> "This is " + i.toUpperCase())
        .collect(Collectors.toList());
        list2.stream().forEach(i -> System.out.println(i));

    }
}
