package Arrays;

public class MinMaxArrayPrac {

    public static void largestAndSmallest(int[] a){

        if (a==null){

            return;
        }
        int largest = a[0];
        int smallest =a[0];

        for (int i=1; i<a.length; i++){

            if (a[i]>largest){
                largest = a[i];
            }else if (a[i]<smallest){
                smallest = a[i];
            }
        }

        System.out.println("largest number is : " + largest);
        System.out.println("smallest number is : " + smallest);

    }

    public static void main(String args[]) {

        largestAndSmallest(new int[]{-20, 34, 21, -87, 92});
        largestAndSmallest(new int[]{10, -1, -2});
        largestAndSmallest(new int[]{25, 40, 12, -5});
        largestAndSmallest(new int[]{1, -1, 0});
        largestAndSmallest(new int[]{});
    }

}
