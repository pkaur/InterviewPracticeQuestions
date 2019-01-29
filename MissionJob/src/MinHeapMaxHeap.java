import java.util.Comparator;
import java.util.Queue;
import java.util.*;

public class MinHeapMaxHeap {

    public static void main(String[] args) {
        Queue<Integer> maxHeap = new java.util.PriorityQueue<Integer>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        Queue<Integer> minHeap = new java.util.PriorityQueue<Integer>();

        int[] ia = {1, 10, 5, 3, 4, 7, 6, 9, 8};

        for (int item : ia) {
            minHeap.add(item);
            maxHeap.add(item);
        }

        System.out.println("Min heap:");

        while (minHeap.size() != 0) {
            System.out.println(minHeap.poll());
        }

        System.out.println("Max heap:");
        while (maxHeap.size() != 0) {
            System.out.println(maxHeap.poll());
        }
    }
}