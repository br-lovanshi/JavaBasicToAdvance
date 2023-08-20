package CollectionFramwork;

import javax.rmi.CORBA.StubDelegate;
import java.util.ArrayList;
import java.util.Scanner;

public class IProblem {
    private int makrs,roll;
    private String name;

    IProblem(){

    }
    IProblem(int roll,int makrs,String name){
        this.makrs  =makrs;
        this.roll = roll;
        this.name = name;



    }

    public int getMakrs() {
        return makrs;
    }

    public void setMakrs(int makrs) {
        this.makrs = makrs;
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
}

class Imain{

    public static void main(String[] args) {
        ArrayList<IProblem> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int c =1;
        while(true){
            System.out.println ("Enter the details of students  "+c++);
            System.out.println("roll");
            int roll = sc.nextInt();
            System.out.println("marks");
            int marks = sc.nextInt();
            System.out.println("name");
            String  name = sc.next();
//            sc.nextLine();

            IProblem ip = new IProblem(roll,marks,name);
            al.add(ip);
            System.out.println("Want more( y/n) ? ");
            String choise = sc.next();
            if(choise.equalsIgnoreCase("n")){
                break;
            }

        }System.out.println("Printing Details of all Student");

            for (IProblem ii :al){
//                System.out.println(ii);

                System.out.println(ii.getName());
                System.out.println(ii.getRoll());
                System.out.println(ii.getMakrs());
            }

    }
}
