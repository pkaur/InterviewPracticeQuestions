package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxArray {

    public static void largestAndSmallest(int[] numbers) {

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i=1; i<numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {

                smallest = numbers[i];
            }
        }


        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + largest);
        System.out.println("Smallest number in array is : " + smallest);
    }

    public static void main(String args[]) {

    largestAndSmallest(new int[]{-20, 34, 21, -87, 92});
    largestAndSmallest(new int[]{10, -1, -2});
    largestAndSmallest(new int[]{25, 40, 12, -5});
    largestAndSmallest(new int[]{1, -1, 0});
    }

}
