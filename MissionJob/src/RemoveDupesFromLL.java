public class RemoveDupesFromLL {

    public static Node removeDuplicatesFromUnsortedLinkedListWithoutExtraSpace(Node head)
    {
        Node cur = head;
        Node next = null;
        while (cur != null && cur.next != null) {
            next = cur;
            while (next.next != null) {
                if (cur.data == next.next.data) {
                    next.next = next.next.next;
                } else {
                    next = next.next;
                }
            }
            cur = cur.next;
        }
        return head;
    }

    public static void removeMid(Node mid){

        /*if (mid.next == null){
            return;
        }

        Node current = mid;
        current.data = current.next.data;
        current.next = current.next.next;
*/

        if (mid == null)
        {
            return;
        }
        Node temp =mid;
        while(temp.next.next != null)
        {
            temp.data = temp.next.data;
            temp = temp.next;
        }
        temp.data = temp.next.data;
        temp.next = null;

    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList();
        ll.insertInBeginning(10);
        ll.insertInBeginning(5);
        ll.insertInBeginning(5);
        ll.insertInBeginning(11);
        ll.insertAtEnd(9);
        ll.insertAfter(ll.head.next.next, 8);
        ll.insertInBeginning(6);
        ll.insertAtEnd(6);
        System.out.println("\nCreated Linked list is: ");
        ll.printLinkedLink();

        System.out.println("\nLength of Linked List is: " + ll.lengthOfLL(ll.head));
         RemoveDupesFromLL.removeDuplicatesFromUnsortedLinkedListWithoutExtraSpace(ll.head);
        ll.printLinkedLink();

        System.out.println("\nLinked List after removing mid : ");
        RemoveDupesFromLL.removeMid(ll.head.next);
        ll.printLinkedLink();

    }
}
