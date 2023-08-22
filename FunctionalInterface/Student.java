package FunctionalInterface;

public class Student{
    private int roll;
    private String name;
    private float marks;

    public Student(int roll,String name,Float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll(){
        return this.roll;
    }

    public String getName(){
        return this.name;
    }

    public float getMarks(){
        return this.marks;
    }

    @Override
    public String toString(){
        return this.toString();
    }
}