package Arrays;

import java.util.PriorityQueue;

public class KthSmallestInArray {

    public static int findKthSmallest(int[] a, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : a){
            pq.offer(num);
        }

        int currentno =0 ;

        while(k>0){

            currentno = pq.poll();
            k--;
        }

        return currentno;
    }

    public static void main(String[] args){

        int[] a = {2, 8, 4, 6, 1, 10, 19, 21, 3, 6 };
        System.out.println(findKthSmallest(a, 3));
    }
}
