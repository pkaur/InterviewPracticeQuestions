package HackerRank;

import java.util.LinkedList;

public class RemoveNthNodeFromEnd {

    public class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next=null;
        }
    }
    public Node removeNthFromEnd(Node head, int n) {

        if (head == null)
            return null;

        Node fast = head;
        Node slow = head;

        for(int i=0; i <n; i++) {
            fast = fast.next;
        }

        //if remove the first node
        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }


    Node head;

    public void printLinkedLink() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public void insertInBeginning(int d) {

        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;

    }

    public static void main(String[] args){
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();
        ll.insertInBeginning(4);
        ll.insertInBeginning(5);
        ll.insertInBeginning(11);
        ll.insertInBeginning(15);
        ll.insertInBeginning(20);
        ll.printLinkedLink();
        System.out.println();

        ll.removeNthFromEnd(ll.head, 5);
        ll.printLinkedLink();
    }
}