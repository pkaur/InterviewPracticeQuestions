package Arrays;

import java.util.HashMap;

public class FindPairsPrac {


    public static void printPairs(int[] arr, int sum) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int a : arr) {
            int target = sum - a;

            if (hm.containsKey(target)) {
                System.out.printf("%d,%d %n", a,target);
            } else {
                hm.put(a, 1);
            }

        }
    }

    public static void main(String args[]) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};

        printPairs(numbers, 7);
        printPairs(numbersWithDuplicates, 7);
    }
}
