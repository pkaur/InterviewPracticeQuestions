package HackerRank;

public class MinCostClimbingstairs {
    public static int minCostClimbingStairs(int[] cost) {
        // assuming 'cost' can be changed, otherwise O(n) space
        for (int i = 2; i < cost.length; i++) {
            // how did I get to this point? Either from the one before, or from two before this
            // also I'm going to save the cost of getting here
            cost[i] = cost[i] + Math.min(cost[i - 1], cost[i - 2]);
        }
        // I reached the top from the last step or the second last step, whatever costed me less
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    public static void main(String args[]){

        int[] a={10, 15, 20};
        int[] b={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(a));
        System.out.println(minCostClimbingStairs(b));
    }
}
