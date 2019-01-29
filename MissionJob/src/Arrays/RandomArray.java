package Arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static int[] printRandomArray(int length) {

        int[] a = new int[length];

        for (int i = 0; i < length; i++) {

            a[i] = (int) (Math.random() * 15 + 1);

        }


        return a;

    }

    public static void merge(int[] ar, int l, int m, int r) {

        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        /* create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /* Copy data to temp arrays L[] and R[] */
        for (i = 0; i < n1; i++)
            L[i] = ar[l + i];
        for (j = 0; j < n2; j++)
            R[j] = ar[m + 1 + j];

        /* Merge the temp arrays back into arr[l..r]*/
        i = 0; // Initial index of first subarray
        j = 0; // Initial index of second subarray
        k = l; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                ar[k] = L[i];
                i++;
            } else {
                ar[k] = R[j];
                j++;
            }
            k++;
        }

    /* Copy the remaining elements of L[], if there
       are any */
        while (i < n1) {
            ar[k] = L[i];
            i++;
            k++;
        }

    /* Copy the remaining elements of R[], if there
       are any */
        while (j < n2) {
            ar[k] = R[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] ar, int l, int r) {

        if (l < r) {
            // Same as (l+r)/2, but avoids overflow for
            // large l and h
            int m = l+ (r-l) / 2;

            // Sort first and second halves
            mergeSort(ar, l, m);
            mergeSort(ar, m + 1, r);

            merge(ar, l, m, r);
        }

    }

    /* UTILITY FUNCTIONS */
    /* Function to print an array */
    static void printArray(int A[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.printf("%d ", A[i]);
        System.out.printf("\n");
    }


    public static void main(String[] args) {

        int arr[] = printRandomArray(6);

        System.out.printf("Given array is \n");
        printArray(arr, arr.length);

        mergeSort(arr, 0, arr.length - 1);
        System.out.printf("\nSorted array is \n");
        printArray(arr, arr.length);
    }

}
