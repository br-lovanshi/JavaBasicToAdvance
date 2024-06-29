class Common {
    // method level synchronization make our process slow to execute task so it recommend to use block level synchronization
    public synchronized void greet(String name) {
//        code before this
        System.out.print("Hello ");
        synchronized (Common.class){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
//        rest other code
    }
}

class ThreadA extends Thread {

    Common common;
    String name;

    ThreadA(Common c, String name){
        this.common = c;
        this.name = name;
    }

    @Override
    public void run() {
        common.greet(name);
    }
}

class ThreadB extends Thread {

    Common common;
    String name;

    ThreadB(Common c, String name){
        this.common = c;
        this.name = name;
    }

    @Override
    public void run() {
        common.greet(name);
    }
}


public class RaceCondition {

    public static void main(String[] args) {
        Common common = new Common();
//        common.greet("Brajesh");

        ThreadA threadA = new ThreadA(common, "Brajesh Lovanshi");
        ThreadB threadB = new ThreadB(common, "Vicky Lovanshi");

        threadA.start();
        threadB.start();
    }
}

/**
 * Here the output is :- Hello Hello Brajesh Lovanshi Vicky Lovanshi
 * without synchronization.
 *
 * If multiple resource trying to access the same data at the same time then data inconsistency occur or rase condition occure wich means incorrect data we get
 * to avoid this we use synchronization.
 * Synchronization we can apply on method and block not on class and field
 * after implementing synchronization only one object or resource access it at a time.
 * */