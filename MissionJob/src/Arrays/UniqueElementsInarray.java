package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueElementsInarray {

    public static ArrayList<Integer> uniqueNumbers(int[] arr){

        Map<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        if(arr.length==0)
        {
            return result;
        }

        for(int i=0; i<arr.length; i++){

            if(!hm.containsKey(arr[i])){
                    hm.put(arr[i], 1);
                } else {
                    hm.put(arr[i], hm.get(arr[i])+1);
                }
            }

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){

            if(entry.getValue() ==1){
                result.add(entry.getKey());
            }
        }

        return result;

        /*
        int[] result = new int[list.size()];
        for (int v : list) {
        result[i++] = v;
    }
    return result;
         */
    }

    public static void main(String[] args){
        int[] a={5, 2, 1, 0, 3, 1, 2, 4, 2};
        int[] b={};
        int[] c={-1,-2,3,4};
        int[] d={-1,-2,-2,1,3};

System.out.println(uniqueNumbers(a));
System.out.println(uniqueNumbers(b));
System.out.println(uniqueNumbers(c));
System.out.println(uniqueNumbers(d));
    }

}
