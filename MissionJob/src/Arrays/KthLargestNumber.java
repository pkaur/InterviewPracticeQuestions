package Arrays;

import java.util.PriorityQueue;

public class KthLargestNumber {

    public static int findKthLargest(int[] a, int k){


        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: a){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.peek();
    }

    public static void main(String[] args){

        int[] a = {2, 8, 4, 6, 1, 10, 19, 21, 3, 6 };

        System.out.println(findKthLargest(a,2));
    }
}
