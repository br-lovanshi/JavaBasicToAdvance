package collectionFramework.map.sortCustomObject;

import java.util.Comparator;
import java.util.Objects;

public class Student1 { //implements Comparable<Student>{

    private int id;
    private String name;
    private int marks;

    public Student1() {
    }

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student1 student1)) return false;
        return Objects.equals(id, student1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
////        return Integer.compare(o.getMarks(),this.marks);
//        return o.getName().compareTo(this.name);
//    }

}

class StudentMarksComparator implements Comparator<Student1>{


    @Override
    public int compare(Student1 o1, Student1 o2) {
        return Integer.compare(o1.getMarks(), o2.getMarks());
    }

    @Override
    public Comparator<Student1> reversed() {
        return Comparator.super.reversed();
    }
}

class StudentNameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
