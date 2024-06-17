package opps.ClassesAndObjects;

public class Sunday {
    String day = "sunday";

    public static void main(String[] args) {
        String day = "Saturday";
        Sunday object = new Sunday();
        object.day = day;
        System.out.println(object.day);

        Sunday object1 = new Sunday();
        System.out.println(object1.day);
    }
}
