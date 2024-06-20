import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

class MainClass {
    
    public static void main(String args[]) throws IOException{

        Scanner sc = new Scanner(System.in());
        System.out.println("Enter student name");
        String name = sc.nextString();
        System.out.println("Enter Student age");
        int age = sc.nextInt();
        sc.nextLine();

        List<String> subjects = new ArrayList<>();

        for(int i = 0;i<6;i++){
        System.out.println("Enter subject " + i + "name : ");
        String subject = sc.nextLine();
        subjects.add(subject);
        }
        List<Integer> marksList = new ArrayList<>();
        for(int i = 0;i<6;i++){
            System.out.println("Subject " + i + "mraks : ");
            int marks = sc.nextInt();
            marksList.add(marks);
        }
        
        sc.close();

        List<Integer> marksLlist = new ArrayList<>();
        marksLlist.add(marks);
        Student student = New Student(name, age, subjects, marksLlist);

        System.out.println(student.toString());

    }
}