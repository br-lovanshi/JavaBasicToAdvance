package basicConcept.memoryAllocation;

/**
 * source of study :- https://www.codingninjas.com/studio/guided-paths/basics-of-java/content/120297/offering/1404701?goalRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
 * Garbage collector is the process to collect the unused object.
 * It automatically removed unused objects.
 * THe main purpose of gc is to allow effective use of memory.
 */
class Test{
    public void greet(){
        System.out.println("Ram Ram Ji!");
    }
}
public class GarbageCollector {
    public static void main(String[] args) {
//        Way to meke object eligble for garbage collector

//        -> nullify the object
        Test test = new Test();
        test = null;

//        assigning reference of another object
        Test test1 = new Test();
        Test test2 = new Test();
        test1 = test2;
//        test1.greet();

//        request JVM to run garbage collector
        System.gc();

        Test obj = new Test();
        obj = null;

//        requesting JVM to run garbage collector
        Runtime.getRuntime().gc();

    }

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    public void finalize() throws Throwable
    {     System.out.println("Garbage collector calling");
        System.out.println("Garbage collected object " + this);
    }
}
