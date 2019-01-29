package LinkedList;

public class AddNodeToBegining {

    static Node head;
    public static void addNodeToBeginning(int d){

        Node newNode = new Node(d);
        newNode.next=head;
        head=newNode;


    }
    public static void main(String[] args){

        Node linkedList = LinkedList.generateLinkedList(10);
        LinkedList.printLinkedList(linkedList); //Print first Linked List

        System.out.println();

        addNodeToBeginning(5);
    }

}
