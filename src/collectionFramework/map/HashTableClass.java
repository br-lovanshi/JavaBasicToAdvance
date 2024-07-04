package collectionFramework.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");

        for(Map.Entry<Integer, String> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
