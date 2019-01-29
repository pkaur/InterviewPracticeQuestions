package Arrays;

public class MinSwapsToSortArray {

    public static int countMinSwaps(int[] a){
        int count=0;

        for(int i=0; i<a.length-1; i++){

            while(a[i] != i+1){

                count++;
                int temp= a[i];
                a[i] = a[temp-1];
                a[temp-1] = temp;
            }
        }

        return count;
    }

    public static void main(String[] args){

        int[] ar={4,3,2,1};
        System.out.println(countMinSwaps(ar));
    }
}
