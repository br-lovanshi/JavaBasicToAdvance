package CollectionFramwork;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Arrlist {
    public static void main(String[] args) {

       Collection<String> list = new ArrayLIst<>();
       list.add("foo");
       list.add("bar");
       Arrlist <Integer> arrray12 = new Arrlist<Integer>();
       ar.add(29);
       ArrayList<String> al = new ArrayList<>();
       ArrayList<Integer> a2  = new ArrayList<>();

       al.add("Chill");
       a2.add(29);
       a2.add(3,9,39,399);
       int n = 10;
       for(int i = 0;i<n;i++){
           a2.add(i);
       }
       a2.add(8,3);

       int heloo = 10;
a2.add(null);
for(int i :a2){
// System.out.println(i);
}
       System.out.println(  a2.indexOf(3));
       System.out.println(a2);

       int x = 20;

       Integer it = x;
       int xx = it;
       int xy = it.intValue();
       System.out.println(xy);

ArrayList<Integer> ar = new ArrayList<>();

           ar.add(10);
           ar.add(20);
           ar.add(30);
           ar.add(40);
           ar.add(50);
//                System.out.println(ar.contains(90));
//                System.out.println(ar.contains(10));

       Object[] ob = ar.toArray();
//        System.out.println(ob);

       for(Object o : ob){
           int x = (Integer)o;
           System.out.println(x);
       }


       for(Integer i : al){
           System.out.println(i);
       }

  ArrayList<Integer> all = new ArrayList<>();

   Object[] ob = al.toArray();

   for(Object i:ob){
       int x = (Integer)i;
       System.out.println(x);

   }

       LinkedList<String > ll = new LinkedList<>();
       ll.add("hello");
       ll.add("chill");
       ll.add("bro");

       System.out.println(ll.remove(1));
       System.out.println(ll);
       HashSet<String > hs = new HashSet<>();
       hs.add("hello");
       hs.add("bro");
       hs.add("chill");
       hs.add("bro");
       hs.add("l");
       System.out.println(hs);
       for(String i : hs){
           System.out.println(i);
       }
        LinkedHashSet<String > hs2 = new LinkedHashSet<>();
        hs2.add("hello");
        hs2.add("bro");
        hs2.add("chill");
        hs2.add("bro");
        hs2.add("l");
        System.out.println(hs2);

        }


}
