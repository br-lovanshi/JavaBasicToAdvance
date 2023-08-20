package CollectionFramwork.HascodeAndEqual;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    private  String name;
    private int roll;
    private int marks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return roll == main.roll && marks == main.marks && Objects.equals(name, main.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll, marks);
    }

    public Main(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Main> hs = new HashSet<>();
        hs.add(new Main("brajesh",33,339));
        hs.add(new Main("brajesh",33,339));

        hs.add(new Main("vicky",1,11111));
        System.out.println(hs.size());
        System.out.println(hs);


    }
}
