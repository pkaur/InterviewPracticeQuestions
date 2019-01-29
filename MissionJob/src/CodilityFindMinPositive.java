import java.util.HashSet;
import java.util.Set;

public class CodilityFindMinPositive {

    public static int solution(int[] A) {
        if (A.length == 0) return 1;
        Set<Integer> hs = new HashSet<>();

        int length = A.length;
        for (int i = 0; i < length; i++) {
            hs.add(A[i]);
        }

        for (int i = 1; i <= length; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }

        return length + 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        int[] b = {1, 2, 3};
        int[] c={-1,-3,1,10,50,500000000};


        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }
}
