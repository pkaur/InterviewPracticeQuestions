package Arrays;

/*
Find common elements in three sorted arrays
Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
 */
public class CommonElementsInSortedArray {

    public static void findCommonElements(int[] a1, int[] a2, int[] a3) {

        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length && k < a3.length) {

            if (a1[i] == a2[j] && a2[j] == a3[k]) {
                System.out.print(a1[i] + " " ); i++; j++; k++;
            } else if (a1[i] < a2[j]) {
                i++;

            } else if (a2[j] < a3[k]) {
                j++;

            } else {
                k++;

            }
        }
    }

    public static void main(String[] args) {

        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        findCommonElements(ar1, ar2, ar3);
    }
}
