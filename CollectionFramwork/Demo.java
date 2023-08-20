package CollectionFramwork;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Demo {

    public static String removeDuplicate(String str){
        StringBuilder sb = new StringBuilder();
        char[] ar = str.toCharArray();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

       for(char st :ar){
           lhs.add(st);
       }
       for(char st1 :lhs){
           sb.append(st1);
       }
       return sb.toString();
    }

    public static void main(String[] args) {
      String ans =   removeDuplicate("brrrrrajaaeshshsh");
        System.out.println(ans);


    }
}
