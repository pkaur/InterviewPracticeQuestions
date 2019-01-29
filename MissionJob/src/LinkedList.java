public class LinkedList {

    Node head;

    public void insertInBeginning(int d) {

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

    public void insertAtEnd(int d) {

        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = newNode;
        return;

    }

    public void deleteNode(int key) {

        Node tmp = head;
        Node prev = null;

        if (tmp != null && tmp.data == key) {

            head = tmp.next;
            return;
        }

        while (tmp != null && tmp.data != key) {

            prev = tmp;
            tmp = tmp.next;
        }

        if (tmp == null) return;

        prev.next = tmp.next;

    }

    public int lengthOfLL(Node head) {

        if (head == null) {
            return 0;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {

            count++;
            temp = temp.next;
        }
        return count;
    }



    public Node deleteFirst(Node head) {

        if (head == null) {
            return head;
        }
        Node temp = head;
        head = head.next;

        temp.next = null;
        return temp;
    }

    public Node deleteAtPosition(Node head, int position) {

        int size = lengthOfLL(head);

        if (position > size || position < 1) {
            System.out.println("Invalid position");
            return head;
        }

        if (position == 1) {

            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;

        } else {

            Node previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            Node current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;

        }
    }

    public static Node insertNodeAtPosition(Node head, int data, int position) {

        if(head ==null){
            return head;
        }

        Node newNode = new Node(data);
        if(position==1){
            newNode.next=head;
            return newNode;
        } else{
            Node previous=head;
            int count=1;

            while(count<position-1){
                previous=previous.next;
                count++;
            }

            Node current = previous.next;
            newNode.next=current;
            previous.next=newNode;
            return head;
        }
    }

    public Node reverseLL(Node head){

        if(head == null){
                return head;
        }

        Node current=head;
        Node previous=null;
        Node next=null;

        while(current!=null){

            next = current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;

    }

    public Node findMiddle(Node head){
        if(head == null){
            return head;
        }

        Node slowPtr=head;
        Node fastPtr=head;

        while(fastPtr!=null && fastPtr.next!=null){

            slowPtr = slowPtr.next;
            fastPtr=fastPtr.next.next;
        }

        return slowPtr;
    }

    public Node deleteLast(Node head) {

        Node last = head;
        Node previousToLast = null;

        while (last.next != null) {

            previousToLast = last;
            last = last.next;
        }

        previousToLast.next = null;

        return last;
    }

    public boolean search(int data) {

        Node curr = head;

        while (curr != null) {

            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public void printLinkedLink() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList();
        ll.insertInBeginning(10);
        ll.insertInBeginning(5);
        ll.insertInBeginning(6);
        ll.insertAtEnd(9);
        ll.deleteNode(5);
        ll.insertAtEnd(11);
        ll.insertAfter(ll.head.next.next, 16);

        ll.insertAfter(ll.head.next.next, 8);

        System.out.println("\nCreated Linked list is: ");
        ll.printLinkedLink();
/*
        ll.head = ll.reverseLinkList(ll.head);
        System.out.println("\nReversed Linked list is: ");
        ll.printLinkedLink();

        System.out.println("\nLength of Linked List is: " + ll.lengthOfLL());
        System.out.println("Key returned : " + ll.search(6));*/

        /*System.out.println("===================");
        Node first =ll.deleteFirst(ll.head);
        System.out.println(first.data);
        //ll.printLinkedLink();*/

     /*   System.out.println("===================");
        Node last = ll.deleteLast(ll.head);
        System.out.println(last.data);
        ll.printLinkedLink();*/

        Node mid =ll.findMiddle(ll.head);
        System.out.println("Midle Element : " + mid.data);
/*
        System.out.println("===================");
      insertNodeAtPosition(ll.head, 15, 3);
      ll.printLinkedLink();*/
    }
}

class Node {

    Node next = null;
    int data;

    public Node(int d) {

        data = d;
    }
}
