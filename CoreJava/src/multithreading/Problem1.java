package multithreading;

class Calculate implements Runnable{
    int sum = 0;
    @Override
    public void run(){
        for(int i = 1; i<11; i++){
            sum += i;
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Thread thread = new Thread(calculate);
        thread.start();
        try{
            thread.join(); // main thread/output will only print when sum will calculate or thread will execute first then main thread will execute to print the output
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        int output = calculate.sum;
        for(int i = 0; i<100; i++)
            System.out.println(output);
    }
}

/**
 * Let’s take a thread that will calculate the sum of 1 to 10 number, and another thread (main thread) will print the
 * calculated sum value of first thread.
 * */
