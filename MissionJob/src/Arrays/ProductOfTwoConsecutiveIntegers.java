package Arrays;

public class ProductOfTwoConsecutiveIntegers {

    public static int largestProduct(int[] a) {

        if(a.length <2){
            return 0;
        }
        int product = 1;
        int i = 0;

        while (i<a.length-1) {

            int newProd = a[i] * a[i+1];
            if (newProd > product) {
                product = newProd;
            }
            i++;
        }
        return product;
    }

    public static void main(String[] args){

        int[] a={1,3,5,10,1,2};
        int[] b={-1,3,5,-10,1,-2};
        int[] c={};
        int[] d={-1,-10,-5,-50};
        int[] e={-1};
        int[] f={Integer.MAX_VALUE,1,2,3};
        int[] g={Integer.MIN_VALUE,1,2,3};
        int[] h={Integer.MIN_VALUE,-1,-2,-3};
        int[] i={Integer.MIN_VALUE-1,1,2};
        int[] j={Integer.MAX_VALUE+1,1,2,3};
        int[] k={Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] l={6,11,2,3,4,1,8,45,34,56,2,1,3,2,11,3,9,3,0,0,4,5,6,33,2,11,53,56,32,66,672,54,656,22,3,5,1};


        System.out.println(largestProduct(a));
        System.out.println(largestProduct(b));
        System.out.println(largestProduct(c));
        System.out.println(largestProduct(d));
        System.out.println(largestProduct(e));
        System.out.println(largestProduct(f));
        System.out.println(largestProduct(g));
        System.out.println(largestProduct(h));
        System.out.println(largestProduct(i));
        System.out.println(largestProduct(j));
        System.out.println(largestProduct(k));
        System.out.println(largestProduct(l));
    }
}
