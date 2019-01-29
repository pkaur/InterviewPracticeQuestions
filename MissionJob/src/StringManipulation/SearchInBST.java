/*
package StringManipulation;

public class SearchInBST {

    Node root;
    class Node {

        Node left, right;
        int val;

        public Node(int item) {

            val = item;
            left = right = null;
        }
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public static Node iterative(Node root,int val){

        if(root == null) return null;

        Node temp=root;

        while(temp!=null){

            if(temp.val == val) return temp;
            else if(temp.val<val) temp=temp.right;
            else temp=temp.left;
        }
        return null;
    }


}
*/
