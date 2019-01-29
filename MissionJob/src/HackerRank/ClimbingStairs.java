package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static int climbStairs(int n) {

        return climbStairsHelper(n, new HashMap<>());
    }
    public static int climbStairsHelper(int n, Map<Integer, Integer> memoized) {
        //base case
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }

        if (memoized.containsKey(n)) {
            return memoized.get(n);
        }

        int answer = climbStairsHelper(n - 1, memoized) + climbStairsHelper(n - 2, memoized);
        memoized.put(n, answer);
        return answer;
    }

    public static void main(String[] args){

        System.out.println(climbStairs(6));
    }
}
