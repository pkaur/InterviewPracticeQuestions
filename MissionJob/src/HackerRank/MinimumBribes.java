package HackerRank;

public class MinimumBribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        // if value at (index+1), index starts at zero, minus the index > 2, then it is
        // a chaotic situation
        for (int i = 0; i < q.length; i++) {
            if ((q[i] - (i + 1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        // now we just need to count number of Swaps
        int swaps = 0;
        for (int i = 0; i < q.length; i++) {
            for (int j = i + 1; j < q.length; j++) {
                if (q[i] > q[j]) {
                    int tmp = q[j];
                    q[j] = q[i];
                    q[i] = tmp;
                    swaps++;
                }
            }
        }

        System.out.println(swaps);

    }

    public  static void main(String[] args){

        int[] a={5,1,2,3,7,8,6,4};
        minimumBribes(a);
    }
}
