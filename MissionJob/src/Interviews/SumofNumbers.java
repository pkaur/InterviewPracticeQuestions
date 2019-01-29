package Interviews;

import java.util.ArrayList;
import java.util.List;

//WALMART ONSITE
public class SumofNumbers {

    public static void sum(String[] ar){

        List<Integer> ls = new ArrayList<>();
        int sum=0;
        for(int i=0; i<ar.length; i++) {
            String[] numbers = ar[i].replaceAll("[\\[\\]]", "").split(",");

            for (int j = 0; j < numbers.length; j++) {
                    sum += Integer.valueOf(numbers[j]);
            }
            ls.add(sum);
            System.out.println(sum);
            sum =0;
        }
    }

    public static void main(String[] args){

        String[] arr = {"[1,2,3]","[4,10,1]","[10,12,1]"};
        sum(arr);
    }
}
