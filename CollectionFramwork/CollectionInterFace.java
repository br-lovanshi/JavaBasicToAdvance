package CollectionFramework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionInterFace {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        int listSize = arrayList.size();
//        arrayList.clear();
        boolean isContains = arrayList.contains(130);
        boolean isEmpty = arrayList.isEmpty();
//        Integer removeEleByIndex = arrayList.remove(0);
        arrayList.addAll(0,arrayList);

        Object[]array = arrayList.toArray();
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] +  " ");
        }
        System.out.println("");

        for(Object arr:array){
            System.out.print(arr + " ");
        }
        System.out.println("");
        int i = 0;
        while (i < array.length) {

            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println("");
        System.out.println(Arrays.toString(array));
        System.out.println("");

//        System.out.println(array);
//        System.out.println(arrayList);


    }
}
