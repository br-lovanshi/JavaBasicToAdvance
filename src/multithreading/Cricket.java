package multithreading;

public class Cricket implements Runnable {

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        for (int i = 1; i < 51; i++) {
            System.out.println(tName + " is running, priority is " + priority);
        }
    }

    public static void main(String[] args) {
        Cricket thread1 = new Cricket();
        Cricket thread2 = new Cricket();

        Thread threadA = new Thread(thread1);
        Thread threadB = new Thread(thread2);

        threadA.setName("Virat Kohali");
        threadB.setName("Sachin Tendulkar");

        // Each thread have priority in the range of 1 to 10, min priority is 1, mid =5 and max = 10
        int t1Priority = threadA.getPriority();// 1
        int t2Priority = threadB.getPriority(); // 1
        int mainThreadPriority = Thread.currentThread().getPriority();// 5

        // Set priority
        threadA.setPriority(10);
        threadB.setPriority(7);
        Thread.currentThread().setPriority(10);

        threadA.start();
        threadB.start();

        // Running main thread
        for (int i = 1; i < 51; i++) {
            String mainThreadName = Thread.currentThread().getName();
            System.out.println(mainThreadName + " is running, priority is " + mainThreadPriority);
        }
    }
}
