
class Thread1 extends Thread { // now we cannot extend any another class

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " is running " + i);
        }
    }
}

class Thread2 implements Runnable { // we can extend another class and take advantage of inheritance

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " is running " + i);
        }
    }
}

public class MainClass1 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " is running " + i);
        }

        Thread1 threadA = new Thread1();
        threadA.currentThread().setName("Brajesh Lovanshi");
        threadA.start();

        Thread2 threadBObj = new Thread2();
        Thread threadB = new Thread(threadBObj);
        threadB.currentThread().setName("Vicky Lovanshi");
        threadB.start();
    }
}
