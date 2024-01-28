package CollectionFramework.miniProgram;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int employeeCount = 1;
        while(true){
            System.out.println("Inter the details of employee " + employeeCount++);

            System.out.println("Enter Employee Id");
            int id = sc.nextInt();

            System.out.println("Enter Employee name");
            String name = sc.next();

            System.out.println("Enter Employee role");
            String role = sc.next();

            employees.add(new Employee(id,name,role));

            System.out.println("Want More (y/n) ?");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("n"))
                break;


        }

        System.out.println("List of student");
        for(Employee employee:employees){
            System.out.println("Id " + employee.getId());
            System.out.println("Name" + employee.getName());
            System.out.println("Role" + employee.getRole());
        }
        System.out.println("Thank you. \n");
    }
}
