package Arrays;

public class FibboItterative {

    public static void fibbo(int n){

        int a=0;
        int b=1;
        int c;

        System.out.print(a + " " +b);

        for (int i=0; i<n; i++){ // O(n)

            c=a+b;
            System.out.print(" " + c);

            a=b;
            b=c;
        }
    }

    public static void main(String[] args){

        fibbo(10);
    }
}
