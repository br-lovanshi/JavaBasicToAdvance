package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleArray1 {

    public static void main(String[] args) {

        int[] arr1 = new int[4];
        char[] charArray = new char[4];
        String[] strArray = new String[3];
        boolean[] booleanArray = new boolean[4];


        ArrayOperation arrayOperation = new ArrayOperation();

//        find max ele
        int[] array =  {2,3,5,6,1,3,2};
//        System.out.println(arrayOperation.findMax(array));

//        find first negative
        int[] findNegative = {-4,2,5,2,5};
//        System.out.println(arrayOperation.findFirstNegative(findNegative));

//        seprate  even and odd ele into array
        int[] seprateOddEven = {4,3,2,6,4,2,7,4};
//        arrayOperation.seprateEvenOdd(seprateOddEven);

//        char array
//        arrayOperation.charArray();

//        find a number from array
//        System.out.println(arrayOperation.findNumber(findMax,1));

//        reversed array
//        arrayOperation.reverseArray(array);
        System.out.println(Arrays.toString(array));
//        arrayOperation.bubbleSort(array);
//        arrayOperation.findSubArray(array);

        arrayOperation.findMaxSumOfSubArray(array);

    }


}
