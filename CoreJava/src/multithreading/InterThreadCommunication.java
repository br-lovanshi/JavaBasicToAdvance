package multithreading;

public class InterThreadCommunication {

    public static void main(String[] args) {

    }
}
/**
 * Inter-thread Communication or Thread-synchronization:
 * It means two synchronized threads communicate each other.
 * Two synchronized thread can communicate each other by using some methods present in Object class, those
 * methods are wait(), notify(), notifyAll().
 *
 * Note:- we can call wait(), notify(),notifyAll() only in the synchronized block or synchronized methods.
 * otherwise we will get a runtime exception.*/