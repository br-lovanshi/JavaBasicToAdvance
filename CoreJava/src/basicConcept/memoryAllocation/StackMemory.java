package basicConcept.memoryAllocation;

/***
 * In Java all the premetives data type, reference data type are stored in the stack.
 * Static memory allocation
 * Thread execution
 *
 * Few important points about stack
 * -> When memory is full throws java.lang.stackOverFlowError
 * -> It only lived till method scope is remains
 * -> Acess to stack Memory is faster then heap memory
 * -> Stack is thread safe
 */

public class StackMemory {
    private void greet(){
        System.out.println("Namaste Brajesh!");
    }
    public static void main(String[] args) {
        int num;
        num = 10;
        System.out.println(num);

        StackMemory referenceDataType;
        referenceDataType = new StackMemory();// object store in the heap memory and reference data type inside stack

        referenceDataType.greet();
    }
}
