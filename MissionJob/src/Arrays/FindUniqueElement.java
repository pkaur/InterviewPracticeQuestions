package Arrays;

/*

There is an array with every element repeated twice except one. Find that element? (solution)
This is an interesting array coding problem, just opposite of question related to finding duplicates in array.
Here you need to find the unique number which is not repeated twice.
For example if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3.


 */
public class FindUniqueElement {

    public static int findUniqueElement(int[] a){

        int result =0;

        for(int num: a){
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args){

        int[] a = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(findUniqueElement(a));

    }
}
