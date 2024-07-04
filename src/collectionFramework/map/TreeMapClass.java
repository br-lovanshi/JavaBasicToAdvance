package collectionFramework.map;

import collectionFramework.map.sortCustomObject.Student1;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(30, "Thirty");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");


//        Sort the student by marks
        TreeMap<Student1, String> treeMap1 = new TreeMap<>(new SortStudentByMark().reversed());

        treeMap1.put(new Student1(2, "Xavior", 90), "UP");
        treeMap1.put(new Student1(3, "Shyam", 60), "HP");
        treeMap1.put(new Student1(1, "Brajesh", 100), "MP");
        treeMap1.put(new Student1(4, "Aman", 83), "MH");
        System.out.println(treeMap1);
    }
}

class SortStudentByMark implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return Integer.compare(o1.getMarks(),o2.getMarks());
    }
}