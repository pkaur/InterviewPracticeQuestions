package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElementsinArray {

    public static ArrayList<Integer> commonInt(ArrayList<Integer> a1, ArrayList<Integer> a2){

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i=0; i<a1.size(); i++){

            if (!hm.containsKey(a1.get(i)))
            hm.put(a1.get(i), 1);
        }

        for(int a: a2){
            if(hm.containsKey(a)){
                newList.add(a);
            }
        }
        return newList;
    }

    public static void main(String[] args){

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1); //{1,4,5,2,0,10}
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);
        a2.add(9);
        a2.add(10);

        System.out.println("Common elements : "+ CommonElementsinArray.commonInt(a1, a2));
    }
}
