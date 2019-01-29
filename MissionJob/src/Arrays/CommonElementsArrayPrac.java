package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonElementsArrayPrac {

    public ArrayList<Integer> findCommonElements(ArrayList<Integer> a1, ArrayList<Integer> a2){

        ArrayList<Integer> newList = new ArrayList<>();
            for (int i=0;i<a1.size(); i++){

                for (int j=0; j<a2.size();j++){

                    if( a1.get(i)== a2.get(j)){
                        newList.add(a1.get(i));
                    }
                }
            }

            return newList;
    }


    public ArrayList<Integer> commonElements(ArrayList<Integer> a1, ArrayList<Integer> a2){

        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ar= new ArrayList<>();
        for(int a:a1){

            if (!hm.containsKey(a)){
             hm.put(a,1);
            } else{
                continue;
            }
        }

        for (int b:a2) {

            if (hm.containsKey(b)) {
                ar.add(b);
            }
        }

        return ar;
    }


    public static void main(String srgs[]){

        CommonElementsArrayPrac obj = new CommonElementsArrayPrac();

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(4);
        a1.add(8);
        a1.add(1);
        a1.add(2);
        a1.add(7);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(1);
        a2.add(2);
        a2.add(11);
        a2.add(7);
        a2.add(6);
        a2.add(12);

        System.out.println(obj.findCommonElements(a1, a2));
        System.out.println(obj.commonElements(a1, a2));
    }
}
