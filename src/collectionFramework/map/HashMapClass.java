package collectionFramework.map;

import collectionFramework.map.sortCustomObject.Student1;

import java.util.*;

public class HashMapClass {

    public static void main(String[] args) {

        HashMap<String, Student1> hashMap = new HashMap<>();


        hashMap.put("UP", new Student1(2, "Xavior", 90));
        hashMap.put("HP", new Student1(3, "Shyam", 60));
        hashMap.put("MP", new Student1(1, "Brajesh", 100));
        hashMap.put("MH", new Student1(4, "Aman", 83));

//        get keys or states
        Set<String> keys = hashMap.keySet();

        for(String state: keys){
//            System.out.println(state);
        }

//        get values or students
        Collection<Student1> students = hashMap.values();
        for(Student1 st : students){
//            System.out.println(st);
        }

        Set<Map.Entry<String, Student1>> entryset = hashMap.entrySet();
//        System.out.println(entryset);

//        Iterate hashmap
        for(Map.Entry<String , Student1> entry: entryset){
//            System.out.println("State: " + entry.getKey());
//            System.out.println("Student: " + entry.getValue());
        }
//        students.stream().forEach(System.out::println);

        //    sort hashmap by using student marks
        // Step 1: Convert the HashMap entries to a list
        List<Map.Entry<String,Student1>> listEntrySet = new ArrayList<>(hashMap.entrySet());
        // Step 2: Sort the list using a custom comparator
        listEntrySet.sort((e1, e2) ->Integer.compare(e2.getValue().getMarks(), e1.getValue().getMarks()));

//        Sort by name
        listEntrySet.sort((e1, e2) -> e1.getValue().getName().compareTo(e2.getValue().getName()));

        // Step 3: Create a new LinkedHashMap to preserve the sorted order
        LinkedHashMap<String, Student1> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<String, Student1> entry: listEntrySet){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(linkedHashMap);

    }
}

