package StringManipulation;

public class ReverseLinkList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertInBegining(int d) {

        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prev, int d) {

        if (prev == null) {
            return;
        }

        Node newNode = new Node(d);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public Node reverseLL(Node n) {

        Node curr=head;
        Node prev=null;
        Node next=null;

        while(curr !=null) {
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }

        n=prev;
        return n;
    }

    public void printLinkedLink() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public static void main(String args[]) {

        ReverseLinkList ll = new ReverseLinkList();
        ll.insertInBegining(10);
        ll.insertInBegining(5);
        ll.insertInBegining(6);
        ll.insertAfter(ll.head.next.next, 8);

        ll.insertInBegining(9);

        System.out.println("\nCreated Linked list is: ");
        ll.printLinkedLink();

        ll.head = ll.reverseLL(ll.head);
        System.out.println("\nReversed Linked list is: ");
        ll.printLinkedLink();

    }

}
