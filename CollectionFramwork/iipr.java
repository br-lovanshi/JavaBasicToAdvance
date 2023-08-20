package CollectionFramwork;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Studentt {
    private int roll;
    private String name;
    private int marks;

    public Studentt(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Studentt() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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
}
public class iipr {
    public static void main(String[] args) {
        List<Studentt> list = new ArrayList<>();
        int c = 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("ente the detail of student " + c);
            System.out.println("rol");
            int roll = sc.nextInt();
            System.out.println("marks");
            int marks = sc.nextInt();
            System.out.println("name");
            String name = sc.next();

            Studentt s = new Studentt(roll,name,marks);
            list.add(s);
            System.out.println("Want to add more (y/n) ");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("n")){
                break;
            }
        }

        for (Studentt i :list){
            System.out.println(i.getRoll());
            System.out.println(i.getName());
            System.out.println(i.getMarks());
        }
    }
}
