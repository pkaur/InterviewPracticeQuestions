public class BST {

    class Node {

        Node left, right;
        int key;

        public Node(int item) {

            key = item;
            left = right = null;
        }
    }

    Node root;

    void BST() {
        root = null;
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

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {

        if (root == null) return root;

        else if (key < root.key)
            root.left = deleteRec(root.left, key);

        else if (key > root.key)
            root.right = deleteRec(root.right, key);

            //when root is the key
        else {
            // node with 1 child or no child
            if (root.left == null)
                return root.right;

            if(root.right == null)
                return root.left;

            // node with 2 children, get inorder successor(min val from right subtree)
            root.key = minVal(root.right);

            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minVal(Node node){

        int minv = node.key;
        while (node.left!=null){

            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {

        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(25);
        tree.insert(15);
        tree.insert(10);

        // print inorder traversal of the BST
        tree.inorder();


        tree.deleteKey(25);
        tree.inorder();

    }
}
