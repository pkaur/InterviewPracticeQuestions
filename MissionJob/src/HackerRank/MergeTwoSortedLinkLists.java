package HackerRank;

public class MergeTwoSortedLinkLists {

    public class Node {

        Node next;
        int data;

        Node(int d){
            data=d;
        }
    }
    public Node mergeLists(Node headA, Node headB){

        Node dummynode= new Node(0);
        Node tail=dummynode;

        while(true){

            if(headA==null){
                tail.next=headB;
                break;
            }

            if (headB==null){
                tail.next=headA;
                break;
            }

            if(headA.data<=headB.data){
                tail.next=headA;
                headA=headA.next;
            } else {
                tail.next=headB;
                headB=headB.next;
            }

            tail=tail.next;
        }
        return dummynode.next;
    }
}
