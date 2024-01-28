package CollectionFramework.FunctionalInterface;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
 public interface FunctionalInterFace1 {
    public int sum(int one,int two);

    public  static String name(String name){
        return  ("Your name is " + name);
    }

}

class Greeting implements FunctionalInterFace1{
    public void sayHello(String name){
        System.out.println("Hello " + name);
    }

    @Override
    public int sum(int one,int two){
       return one+two;
    }
}
 class Main{

    public static void main(String[] args) {
        FunctionalInterFace1 greet = new Greeting();
        greet.sum(1,3);

//        lembda expression
        FunctionalInterFace1 inter1 = (one,two) -> (one + two);
        int ans = inter1.sum(3,6);
//        System.out.println(ans);

        FunctionalInterFace1 inter2 = (one,two) -> one+two;
//        System.out.println(inter2.sum(4,6));

//        Predicate
        Predicate<String> name = n -> n == "Brajesh";
        boolean isTrue = name.test("Brajesh"); //true
        Predicate<Integer> number = n -> n>10;
        boolean isGreater = number.test(10);
//        System.out.println(isGreater);

//        Consumer
        List<Integer> list = Arrays.asList(1,1,2,3,45,64,3);
        Consumer<List> lists = l -> {
            System.out.println(l);
        };
//        lists.accept(list);

//        forEach loop in collection
        list.forEach(i ->System.out.println(i));
//        list.forEach(System.out::println);

//         Supplier
        Supplier<String> helloWOrld = () -> "Hello world!";
        String str =  helloWOrld.get();
//        System.out.println(str);

//        Function
        Function<String,Integer> function1 = f -> Integer.parseInt(f);
        System.out.println(function1.apply("1000")+22);

        List<Integer> list2 = new LinkedList<>();
        list2.add(20);
        list2.add(30);
        list2.add(40);

        list2.forEach(System.out::print);


    }
}
