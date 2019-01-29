package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionLinkedList {


    class Node {

        Node next = null;
        int data;

        public Node(int d) {

            data = d;
        }
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null){
            //no intersection found
            return null;
        }

        Set<Node> hset = new HashSet<>();
        while(headA!=null){
            hset.add(headA);
            headA=headA.next;

        }
        while(headB!=null){
            if(hset.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;

    }

    public static void main(String[] args){



    }
}
