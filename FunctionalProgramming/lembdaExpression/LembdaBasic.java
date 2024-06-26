import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Inter1{
    // void sayHello(String name);

    int sum(int a, int b);
}

public class LembdaBasic {

    public static void sumFun(Inter1 inter1){
        // System.out.println(inter1.sum(10, 03));
    }
    public static void main(String[] args) {
        // Inter1 inter1 = (String name) ->{
        //     System.out.println("Hello " + name);
        // };
        // inter1.sayHello("Brajesh");

        // more short way is 
        // Inter1 inter2 = name -> System.out.println("Hello " + name);
        // inter2.sayHello("Brajesh Lovanshi");
        Inter1 inter3 = (int a, int b) -> a * b;
        int sum1 = inter3.sum(10,30);
        // System.out.println(sum1);

        // sumFun((n1,n2) -> n1+n2);


        // sort the list 
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(230);
        list.add(24);
        list.add(90);
        list.add(8);
        int min = Collections.min(list);
        
        Collections.sort(list, (s1,s2) -> s1 > s1? +1 : -1);
        System.out.println(2);
        
    }

}
/*
 * Lembda Expression is annonimous and unnambed method by using wich we can
 * can represent objects of functional interface in much more simple way.
*/