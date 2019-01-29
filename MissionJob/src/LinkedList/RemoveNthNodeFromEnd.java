package LinkedList;

public class RemoveNthNodeFromEnd {

    public static Node removeNthNodeFromEnd(Node head, int n){

        if(head == null) return null;

        Node fast=head;
        Node slow=head;

        for(int i=0;i<=n+1; i++){
            if(fast==null) return head;
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;
    }


    public static void main(String[] args){

        Node linkedList = LinkedList.generateLinkedList(10);
        LinkedList.printLinkedList(linkedList); //Print first Linked List

        System.out.println();

        Node newLinkedList = removeNthNodeFromEnd(linkedList, 2); //Remove the nth Node from end
        LinkedList.printLinkedList(newLinkedList); //Print new Linked List
    }
}
