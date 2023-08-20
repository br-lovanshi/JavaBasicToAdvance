package CollectionFramwork;

import java.util.*;

public class RemoveDuplicate {
    public static String removeDuplicates(String str){

        StringBuilder sb= new StringBuilder();

        char[] charArr = str.toCharArray();
        Set<Character> lhs = new LinkedHashSet<>();
        for(char c:charArr){
            lhs.add(c);
        }
        for(char c1 :lhs ){
            sb.append(c1);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String ans = removeDuplicates("chiilllll");
//        System.out.println(ans);
//        LinkedHashSet<Character> lh = new LinkedHashSet<>();
//        lh.add('a');
//        lh.add('b');
//        lh.add('a');
//        StringBuilder sb = new StringBuilder();
//        for (char c : lh){
//            sb.append(c);
//        }
//        System.out.println(lh);
//        System.out.println(sb);
//        List<String > ll = new ArrayList<>();
//        ll.add("brajesh");
//        ll.add("Lovanshi");
//
//        StringBuilder sb = new StringBuilder();
//        for (String c:ll)
//            sb.append(c);
//        System.out.println(sb);
//        System.out.println(ll);


        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(29);
        ll.add(29);
        ll.add(9);

        ll.add(29);
        ll.add(2);

        ll.add(29);
        ll.add(29);
        Set<Integer> hs = new LinkedHashSet<>(ll);

        System.out.println(hs);
        ll = new LinkedList<>(hs);
        System.out.println(ll);
    }
}

