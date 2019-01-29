package Arrays;

public class FibboRecursion {

    // 0 1 1 2 3 5 8 13
    public static int fibbo(int n) {

        if (n < 2) return n;

        return fibbo(n - 1) + fibbo(n - 2); // fibbo(1) + fibbo(0) (n-1) * (n-2) * (n-3)
    }

    public static void main(String[] args) {

        int N = 2;
        for (int i = 0; i <= N; i++) { // n times - 5

            System.out.print(" " + fibbo(i));
        }
    }
}
