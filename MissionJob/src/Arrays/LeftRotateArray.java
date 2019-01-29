package Arrays;

public class LeftRotateArray {

    public static void rotateArray(int[] a, int d){
        for(int i=0; i<d;i++){
            int j, temp=a[0];
            for(j=0; j<a.length-1; j++){

                a[j] = a[j+1];

            }
            a[j] = temp;
        }
    }

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args){

        int[] a={1,2,3,4,5,6};
        rotateArray(a, 2);
        printArray(a);
    }
}
