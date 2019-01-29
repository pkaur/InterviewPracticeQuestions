    package LinkedList;

import java.util.Random;

public class LinkedList {

    static Node head;
    public static Node generateLinkedList(int len){

        Random rand=new Random();
        Node head = new Node(rand.nextInt(10)+1);
        Node current=head;

        for(int i=0; i<len-1;i++){
            current.next = new Node(rand.nextInt(10)+1);
            current =current.next;
        }

        return head;
    }

    public static void printLinkedList(Node head){
        if(head == null) System.out.println("Linked List is null.");

        while(head != null){
            System.out.print("[ " + head.data + " ]");
            if(head.next != null){
                System.out.print(" --> ");
            }
            head = head.next;
        }
    }
}
