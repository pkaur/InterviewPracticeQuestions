package StringManipulation;

public class fibbonacci {

    public static int calcFibbo(int len){

        int a =0;
        int b=1;
        int c;

        System.out.print(a + " ");
        System.out.print(b + " ");
        if (len == 0)
            return a;

        for (int i=2; i<=len; i++){

            c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;

        }
return b;

    }

    public static void main(String[] args){

        System.out.println(fibbonacci.calcFibbo(11));
    }
}
