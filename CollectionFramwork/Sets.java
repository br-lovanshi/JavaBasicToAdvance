package CollectionFramework;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        Set<Integer> hasest = new HashSet<>();

        hasest.add(10);
        hasest.add(20);
        hasest.add(null);
        hasest.add(3);
        hasest.add(10);
//        System.out.println(hasest);

        for(Integer num:hasest){
            System.out.println(num);
        }
        boolean searching = hasest.contains(10);

        System.out.println(searching);
        Set<String> linkedHasSet = new HashSet<>();

        linkedHasSet.add("Delhi");
        linkedHasSet.add("Ahemdabad");
        linkedHasSet.add("Indore");
        System.out.println(linkedHasSet);
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("fwo");
        treeSet.add("Three");

        System.out.println(treeSet);


    }
}
