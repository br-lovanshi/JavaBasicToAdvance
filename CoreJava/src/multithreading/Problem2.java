package multithreading;

class Greet{

     public void greet(String name){
       synchronized (this){
            System.out.print("Namaste ");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name);
        }
    }
}
class ThreadA implements Runnable{
    Greet greet;
    String name;
    public ThreadA(Greet greet, String name){
        this.greet = greet;
        this.name = name;
    }
    @Override
    public void run() {
        greet.greet(name);
    }
}

class ThreadB implements Runnable{
    Greet greet;
    String name;
    public ThreadB(Greet greet, String name){
        this.greet = greet;
        this.name = name;
    }
    @Override
    public void run() {
        greet.greet(name);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Greet greet = new Greet();
        ThreadA threadA = new ThreadA(greet, "Ram");
        ThreadB threadB = new ThreadB(greet, "Shyam");
        Thread a = new Thread(threadA);
        Thread b = new Thread(threadB);
        a.start();
        b.start();
    }
}
/**
 * Race-condition:
 * Java is a multi-threaded programming language and there is a higher risk to occur race conditions. Because the
 * same resource may be accessed by multiple threads at the same time and may change the data.
 *
 * For example, if thread A is reading data from the linked list and another thread B is trying to delete the same data.
 * This process leads to a race condition that may result in run time error
 *
 * Day14: Multithreading, Executor Framework 13
 * To solve the data inconsistency problem in java synchronized keyword is used.
 * So the thread-safety is achieved and race condition is avoided by the help of synchronized keyword.*/