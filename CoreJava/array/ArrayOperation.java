package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperation {

    //    find the max num from the array]]
    protected int findMax(int[] arr) {

        int maxEle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxEle < arr[i]) {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }

    //    find the first negative number from the array else return 0
    protected int findFirstNegative(int[] arr) {
        int firstNegative = 0;

        for (int num : arr) {
            if (num < firstNegative) firstNegative = num;
        }
        return firstNegative;
    }

    protected void seprateEvenOdd(int[] arr) {

        if (arr.length == 0) System.out.println("Array is empty!");

        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) evenNum.add(num);
            else oddNum.add(num);
        }

        if (evenNum.size() == 0) {
            System.out.println("No even ele found.");
            System.out.println(oddNum);
        } else if (oddNum.size() == 0) {
            System.out.println("No odd ele found.");
            System.out.println(evenNum);
        }

        System.out.println("Even array : " + evenNum);
        System.out.println("Odd array : " + oddNum);

    }

    protected void charArray() {
        char[] charArray = new char[4];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';

        String charArrayToString = new String(charArray);
        System.out.println(charArrayToString);

    }

    //    find a number
    protected int findNumber(int[] array, int num) {
//        int output = Arrays.binarySearch(array,num);
//        return output;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) return i;
        }
        return -1;


    }

    protected void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        int indx = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            reversedArray[indx++] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }

    protected void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));

    }

    //    find subbaarray
    protected void findSubArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int start = i; start <= j; start++) {
                    System.out.print(arr[start]);
                    if (start < j) System.out.print(",");
                }
                System.out.println("]");
            }
        }
    }

    protected void findMaxSumOfSubArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxSum = 0;
            for (int j = i; j < arr.length; j++) {
                maxSum += arr[j];
            }
            if(maxSum > sum) sum = maxSum;

        }
        System.out.println(sum);
    }

}