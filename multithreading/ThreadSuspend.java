public class ThreadSuspend implements Runnable {

    int sum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Thread a is calculating sum or natural number");
            sum = sum + i;

            // suspend using sleep
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadSuspend obj = new ThreadSuspend();

        Thread thread1 = new Thread(obj);

        thread1.start();
        thread1.join(); // suspending using join()
        // Here main thread will wait until the t thread completes
        //if we comment t.join then we will get incorrect value.

        int total = obj.sum;
        for(int i = 0; i<5; i++){
            System.out.println("Main thread is printing  total sum " + total);
        }
    }
}


/**
 * Suspending a thread:
 * 1. Time: - using sleep() method, example:- Thread.sleep(1000);
 *
 * 2. Conditionally :- using join, example:- t1.join();
 * Let’s assume that we have two threads available t1 and t2.
 * now if we have a condition that inside run() method of t1 we need to use some of the values calculated in run()
 * method of t2,then in this case we have to stop the execution of run() method of t1 until the run() method of t2 is
 * completely executed. in such situation we have to make use of join() method.
 *Example:- count the number in using thread1 and print using thread 2
 * 3. Unconditionally.
 *
 * */