package CollectionFramework;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(10,20,30,10,40);
        int set = arrayList.set(2,33);
        int get = arrayList.get(3);
        int indexOf = arrayList.indexOf(10);
//        System.out.println(get);
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
//        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Indore");
        linkedList.add("Bhopal");
        linkedList.add("Ahemdabad");
        linkedList.add("Gandhinagar");
        linkedList.add(2,"Delhi");
        linkedList.remove(3);
        
        System.out.println(linkedList);
    }
}
