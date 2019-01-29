public class ReverseLinkList {

    public class Node {

        Node next;
        int data;

        Node(int d) {

            data = d;
            next = null;

        }
    }

    Node head;

    public void addNodeAtFront(int d) {

        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void addNodeAfter(Node prev, int d) {

        if (prev == null) {
            return;
        }

        Node newNode = new Node(d);
        newNode.next = prev.next;
        prev.next = newNode;

    }

    public void insertAtEnd(int d) {

        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        }

        newNode.next=null;
        Node temp = head;
        while (temp !=null){

            temp=temp.next;
        }

        temp.next=newNode;
        return;
    }

    public Node reverseLinklist(Node node) {
        Node curr = head, prev = null, next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            //real reverse happens here
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public void printLinkedLink() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {

        ReverseLinkList ll = new ReverseLinkList();
        ll.addNodeAtFront(10);
        ll.addNodeAtFront(5);
        ll.addNodeAtFront(3);

        ll.printLinkedLink();

       /* ll.reverseLinklist(ll.head);
        ll.printLinkedLink();*/

    }
}
