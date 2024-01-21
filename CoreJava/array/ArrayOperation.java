package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperation {

//    find the max num from the array]]
    protected int findMax(int[] arr){

        int maxEle = arr[0];

       for(int i = 1; i<arr.length; i++){
           if(maxEle < arr[i]){
               maxEle = arr[i];
           }
       }
       return maxEle;
    }

//    find the first negative number from the array else return 0
    protected int findFirstNegative(int[] arr){
        int firstNegative = 0;

        for(int num : arr){
            if(num < firstNegative) firstNegative = num;
        }
        return firstNegative;
    }

    protected void seprateEvenOdd(int [] arr){

        if(arr.length == 0) System.out.println("Array is empty!");

        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        for(int num : arr){
            if(num %2 ==0) evenNum.add(num);
            else oddNum.add(num);
        }

        if(evenNum.size() == 0){
            System.out.println("No even ele found.");
            System.out.println(oddNum);
        }
        else if(oddNum.size() == 0) {
            System.out.println("No odd ele found.");
            System.out.println(evenNum);
        }

        System.out.println("Even array : " + evenNum);
        System.out.println("Odd array : " + oddNum);

    }
    protected void charArray(){
        char[] charArray = new char[4];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';

        String charArrayToString = new String(charArray);
        System.out.println(charArrayToString);

    }

//    find a number
    protected int findNumber(int[] array, int num){
//        int output = Arrays.binarySearch(array,num);
//        return output;

        for(int i = 0; i < array.length; i++){
            if(array[i] == num) return i;
        }
        return -1;



    }
}
