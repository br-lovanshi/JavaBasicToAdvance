package generic;

import java.util.*;

// without generic
class Box{
    private Object box;
    public void setBox(Object o){
        this.box = o;
    }

    public Object getBox(){
        return this.box;
    }

    <T> void print(T t){ //This is a generic method, not a class. You can use it in any class even if the class is not generic.
        System.out.println(t);
    }
}

// Using generic
class Values<T>{
    T value;
    public void setValue(T t){
        this.value = t;
    }

    public T getValue(){
        return this.value;
    }

    <T> void print(T t){ //This is a generic method, not a class. You can use it in any class even if the class is not generic.
        System.out.println(t);
    }
}

public class Generics {
    public static void main(String[] args) {
        Box box = new Box();
        box.setBox(10);
//        Object object1 = box.getBox();
        Integer intObj = (Integer) box.getBox(); // we must need to cast manually
        System.out.println(intObj);

        Values<Integer> integerValues = new Values<>();
        integerValues.setValue(4);
        Integer intValue = integerValues.getValue();// no need to type cast

        Values<String> name = new Values<>();
        name.setValue("Ram");
        String str = name.getValue();
        System.out.println(str);

        // Without Generics (Not Type Safe
        List list = new ArrayList(); // it will work, noting wrong in it but it is not type safe and may give runtime error
        list.add(3);
        list.add("Ram");
        list.add(true);
        list.add(4.4);
        list.add('a');
//        System.out.println(list);
//        for(Object o : list){
//            System.out.println(o);
//        }

        String name1 = (String) list.get(1); // need to cast manually

        // With Generics (Type Safe)
        List<String> list1 = new ArrayList<>();
        list1.add("Ram");
        //list1.add(23); // not allow to add other type that mentioned

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Math", 90);
        marks.put("Science", 85);

    }
}
/**
 *  What are generics in Java? Why are they used?
 * Answer:
 * Generics allow classes, interfaces, and methods to operate on objects of various types while providing compile-time type safety.
 * They help you write reusable and type-safe code.
 *
 * Generics:- Generic means general not specific.
 * In Java generics allows as to write single class or method that work with any data type like String, Integer, Boolean, Custom type
 * Generic is used in java to write flexible, reusable code.
 * <T> generic: This is generic type by using this type in class we can reuse class for multiple datatype, it is type safe, cleaner code
 * In java: List<Integer>, Set<String> etc are generics only and type safe.
 *
 * see these in real product codebases, especially in:
 *
 * Java Collections (like List<T>, Map<K, V>)
 * REST APIs (generics in response wrappers)
 * Utility/helper classes
 * */