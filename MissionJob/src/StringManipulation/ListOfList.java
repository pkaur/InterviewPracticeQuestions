package StringManipulation;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

public class ListOfList {

    public boolean isRotation(String a1, String a2){

        if(a1.length() != a2.length()){
            return false;
        }
        String temp = a1+a1;

        return isSubString(temp,a2);
    }

    public boolean isSubString(String a1, String a2){

        return a1.contains(a2);
    }

    public ArrayList<String> findRotationsList(ArrayList<String> arr){

        ArrayList<String> al = new ArrayList<>();

al.add(arr.get(0));
        for(int i=1 ; i< arr.size(); i++){
            if(!al.contains(arr.get(i)) && isRotation(al.get(0), arr.get(i))){
                al.add(arr.get(i));
            } else {
                continue;
            }

        }
        return al;
    }

    public static void main(String[] args){

        ArrayList<String> arr = new ArrayList<>();
        arr.add("abcd");
        arr.add("dabc");
        arr.add("ccba");

        ListOfList obj=new ListOfList();
        String a1="water";
        String a2 ="erwat";

        System.out.println(obj.findRotationsList(arr));
        System.out.println(obj.isRotation(a1, a2));
    }
}
