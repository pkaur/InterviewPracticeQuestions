package Interviews;

//Egnyte Onsite
public class OneIterationFindMissingNumber {

    public  static int findMissingNumber(int[] a, int[] b){

        int sum1=0;
        int sum2=0;
        int last=0;

        if(a.length > b.length){
            last = a[a.length-1];
        } else {
            last = b[b.length-1];
        }

        for(int i=0; i<Math.min(a.length, b.length); i++){

         sum1 += a[i];
         sum2 += b[i];
        }

        return ((sum1+last) - sum2);
    }

    public static void main(String[] args){

        int[] a = {5,3,1,2};
        int[] b ={1,4,2,5,3};

        System.out.println(findMissingNumber(a, b));
    }
}
