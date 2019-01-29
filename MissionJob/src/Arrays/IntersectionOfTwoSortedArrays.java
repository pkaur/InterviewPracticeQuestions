package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Write a program to find intersection of two sorted arrays in Java? (solution)
Another interesting array interview question, where you need to treat the array as Set.
Your task is to write a function in your favorite language e.g. Java, Python, C or C++ to return the intersection of two sorted arrays.
For example, if the two sorted arrays as input are {21, 34, 41, 22, 35} and {61, 34, 45, 21, 11},
it should return an intersection array with numbers {34, 21},
For the sake of this problem you can assume that numbers in each integer array are unique.
 */
public class IntersectionOfTwoSortedArrays {

    public static int[] uniqueIntegers(int[] a, int[] b) {

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <a.length; i++){
            hs.add(a[i]);
        }

        for(int num: b){
            if(hs.contains(num)){
                list.add(num);
            }
        }

        int[] result = new int[list.size()];

        int i=0;
        for (int num: list){
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args){

        int[] a={21, 34, 41, 22, 35};
        int[] b={61, 34, 45, 21, 11};

        int[] result = uniqueIntegers(a,b);
        for(int i=0 ; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
