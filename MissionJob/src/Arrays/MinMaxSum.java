package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        int min=arr[0];
        int max=arr[0];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("%d %d" ,sum-max, sum-min);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        miniMaxSum(arr);

    }
}
