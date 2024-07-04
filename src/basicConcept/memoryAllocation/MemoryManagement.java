package basicConcept.memoryAllocation;

public class MemoryManagement {

    // Static variable (stored in the method area)
    public static String name = "Brajesh";

    // Instance variable (stored in the heap)
    String surname;

    MemoryManagement(String surname) {
        surname = surname;
    }

    public void greet() {

        // Local variable (stored in the stack)
        int localVar = 10;
        System.out.println("Hello " + name + " " + surname);
    }

    public static void main(String[] args) {
        // The reference is stored on the stack, and the String object ("vicky") is stored in the string pool (part of the heap).
        String name1 = "vicky";
        name1 = "br";
        System.out.println(name1);

        // Creating an object (allocated on the heap)
        MemoryManagement object = new MemoryManagement("Lovanshi");

//        object.greet();

        //It is a local variable stored on the stack.
        int num = 100;


        //The reference to the array is stored on the stack, and the array object itself is stored on the heap. The elements (10 and 20) are stored within the array on the heap.
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
//        System.out.println(Arrays.toString(arr));
    }
}

/**
 * Memory management
 * Heap memory:-
 * 1. All the object are stored
 * 2. All the class level static variable stored
 * 3. It's divided into generations for garbage collection: young, old, and permanent generations.
 * <p>
 * Stack Memory:-
 * 1. All the local variable and method calls store here
 * 2. Memory is automatically managed here, with frames being pushed and popped as methods are called and return.
 * 3. All the primitive data store here
 * <p>
 * Method Area (or MetaSpace):-
 * 1. This store class level data like methods data, static variable
 * <p>
 * Garbage Collection:-
 * Java has automatic garbage collector which reclaim memory of object that are not longer in use.
 * --------------------------------------------------------------------------------------------------------------------
 *
 * Java Memory management QNA
 *
 * 1. What is the heap in Java, and what is stored there?
 * The heap is a region of memory where objects and their instance variables are stored. It is managed by the JVM's garbage collector. Objects allocated on the heap persist beyond the scope of the method that created them.
 *
 * 2. Explain the difference between stack and heap memory.
 * Stack: Stores local variables and method call information. Each thread has its own stack, and variables on the stack are short-lived, existing only as long as their method is executing.
 * Heap: Stores objects and instance variables. All objects live on the heap, and memory management is handled by garbage collection. Objects on the heap can persist beyond the method that created them.
 *
 * 3. How does garbage collection work in Java?
 * Garbage collection is the process by which the JVM reclaims memory used by objects that are no longer referenced or reachable. It involves several generations (young, old) and algorithms (e.g., Mark-Sweep, Mark-Compact) to efficiently manage memory and reclaim unused objects.
 *
 * 4. What are memory leaks, and how can they occur in Java?
 * Memory leaks occur when objects are no longer needed but cannot be garbage collected because they are still referenced. This can happen due to unintentional references that are not properly released, such as static references or unclosed resources like file handles or database connections.
 *
 * 5. What is the method area, and what kind of data is stored there?
 * The method area (or MetaSpace in newer JVM implementations) stores class-level data, such as method code, field names, static variables, and constant pool. It is shared among all threads and is part of the JVM's memory management.
 *
 * 6. Explain the concept of the string pool in Java.
 * The string pool is a special area in heap memory where Java stores literal strings. String literals (e.g., "hello") are automatically interned (added to the pool) by the JVM to conserve memory and promote reuse.
 *
 * 7. What are soft, weak, and phantom references in Java?
 * Soft References: Objects referenced by soft references are cleared by the garbage collector when memory is low.
 * Weak References: Objects referenced by weak references are cleared by the garbage collector in the next GC cycle, regardless of memory availability.
 * Phantom References: Provide a way to perform post-mortem cleanup actions after an object has been reclaimed by garbage collector.
 *
 * 8. How can you optimize memory usage in Java applications?
 * Use efficient data structures and algorithms.
 * Minimize the use of static variables.
 * Close resources properly (e.g., streams, connections).
 * Avoid unnecessary object creation and excessive memory allocations.
 * Tune JVM memory settings based on application requirements.
 *
 * 9. What tools can you use to monitor and analyze memory usage in Java?
 * JDK tools like jstat, jmap, jconsole, and VisualVM.
 * Third-party tools like YourKit, JProfiler, and Eclipse MAT (Memory Analyzer Tool).
 *
 * 10. What is the purpose of the finalize() method, and when is it called?
 * The finalize() method is called by the garbage collector before reclaiming an object's memory. Its purpose is to perform cleanup actions or release resources held by the object before it is garbage collected. However, it's generally recommended to use explicit resource management (e.g., try-with-resources) instead of relying on finalize() due to uncertainty of when finalize() will be called.
 */
