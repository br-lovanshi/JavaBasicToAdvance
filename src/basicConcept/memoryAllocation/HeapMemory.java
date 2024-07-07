package basicConcept.memoryAllocation;

/**
 * Heap Memory -> When we create any new object is java that will be stored in the heap memory.
 * -> ALl the objects in Java store inside heap memory area
 * -> Heap is not thread safe.
 * -> Accessing heap memory is slower than stack memory
 * -> Java garbage collector will autometically clean heap memory and remove unused objects
 */

public class HeapMemory {

    private void greet(){
        System.out.println("Ram Ram Ji!");
    }

    static public void main(String[] args){

        HeapMemory heapMemory = new HeapMemory();
        heapMemory.greet();
    }
}
