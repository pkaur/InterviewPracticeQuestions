package Arrays;

import java.util.PriorityQueue;

public class TopTwoNumbers {

    public static void topTwoNumbers(int[] ar){

        int max1=ar[0];
        int max2=ar[0];
        for(int i=1; i<ar.length; i++) {

            if (ar[i] > max1) {
                max2 = max1;
                max1 = ar[i];
            } else if( ar[i] > max2){
                max2 = ar[i];
            }

        }

        System.out.println(max1 + " " +max2);
    }

    public static void topTwo(int[] arr){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int a: arr){

            pq.offer(a);
        }

        while (pq.size() >2){

            pq.poll();
        }

        System.out.println("MAX1 : " + pq.poll() + " MAX2 : " + pq.poll());
    }

    public static void main(String[] args){

        int[] arr={10, Integer.MAX_VALUE, 3, 4, 3, 5, 6};
        topTwo(arr);
    }
}
