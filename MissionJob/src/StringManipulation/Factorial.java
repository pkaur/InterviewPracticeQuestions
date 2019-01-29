package StringManipulation;

public class Factorial {

    public static int fact(int n) {

        int factofnum = 1;

        for (int i = n; i > 0; i--) { //O(n)
            factofnum = factofnum * i;
        }

        return factofnum;
    }

    public static int factRec(int num) {

        if (num == 0) return 1;
        return num*factRec(num-1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.fact(5));
        System.out.println(Factorial.fact(0));
        System.out.println(Factorial.factRec(5));
        System.out.println(Factorial.factRec(0));
    }
}
