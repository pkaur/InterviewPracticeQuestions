package HackerRank;

import java.util.Iterator;

public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] result=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            int[] a=A[i];
            a=flip(a);
            a=invert(a);
            result[i]=a;
        }
        return result;
    }

    private int[] invert(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a[i]=1;
            }else{
                a[i]=0;
            }
        }
        return a;
    }

    private int[] flip(int[] a){
        int[] result=new int[a.length];
        for(int i=0;i<a.length;i++){
            result[i]=a[a.length-1-i];
        }
        return result;
    }


    public int[][] flipAndInvertImageMatrix(int[][] A) {
        for (int i = 0;i < A.length;i++) {
            int low = 0;
            int high = A.length - 1;
            while (low <= high) {
                int tmp = A[i][low];
                A[i][low] = A[i][high];
                A[i][high] = tmp;
                low ++;
                high --;
            }
            for (int j = 0;j < A[i].length;j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else if (A[i][j] == 1) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public static void main(String[] args){

        int[][] a= {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        FlipAndInvertImage fi = new FlipAndInvertImage();
        int[][] result = fi.flipAndInvertImage(a);
        int[][] result1=fi.flipAndInvertImageMatrix(a);

        System.out.println("RESULT");
        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

