package collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {

        int[] arr = {2,1,3,59,2,1,2,3,2,1,1,1,2,2,2,1};
        int output = frequentEle(arr);
        System.out.println(output);
    }

    public static int frequentEle(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        int mostFreqEle = arr[0];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > map.get(mostFreqEle)){
                mostFreqEle = entry.getKey();
            }
        }

        return mostFreqEle;
    }
}
