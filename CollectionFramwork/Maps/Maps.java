package CollectionFramework.Maps;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Delhi");
        map.put(2,"Mumbai");
        map.put(3,"Banglore");
        map.put(4,"Delhi");
//        map.put(5,null);

//        System.out.println(map);
        String city = map.get(2);
        LinkedHashSet<String> values = new LinkedHashSet<>( map.values());
        Set<Integer> keySet = map.keySet();
        boolean IsKey = map.containsKey(2);
        boolean isValue = map.containsValue("Delhi");
//        map.clear();
        System.out.println(map.remove(4));
        System.out.println(map);
        System.out.println("==================");
        for(String value : values){
            System.out.println(value);
        }

        for(Integer keys : map.keySet()){
            System.out.println(keys + " " + map.get(keys));
        }
    }
}
