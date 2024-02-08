package opps.inheritance;

class BabyDog extends Dog{

    void sleep(){
        System.out.println("Baby dog is sleeping.");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.barking();
        babyDog.sleep();
    }
}
