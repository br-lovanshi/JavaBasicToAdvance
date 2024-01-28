package CollectionFramework.FunctionalInterface;


public class Student1 {

    private int roll;
    private String name;
    private double marks;

    public Student1(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


}
@FunctionalInterface
interface StudentInter{
    public void printStudent(Student1 student);
}

class Main1{
    public static void main(String[] args) {

        StudentInter student1 = student -> {
            System.out.println("Roll "  + student.getRoll());
            System.out.println("Name " + student.getName());
        };

        student1.printStudent(new Student1(1,"Brajesh",100));



    }
}