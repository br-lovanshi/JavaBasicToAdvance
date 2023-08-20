package CollectionFramwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashLearn {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(null);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(3);
        hs.add(null);
//        System.out.println(hs);
//        for (Integer i :hs){
//            System.out.println(i);
//        }
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Dheli");
        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Bengluro");
        lhs.add("Chennai");
        lhs.add("Noida");
        lhs.add("Gurgoun");
        lhs.add("Mumbai");
        lhs.add(null);
        lhs.add("Kolkata");
        System.out.println(lhs);
        for(String hss : lhs){
            System.out.println(hss);
        }

    }
}
