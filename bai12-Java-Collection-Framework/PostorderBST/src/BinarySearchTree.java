public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if(key< root.data){
            root.left = insert(root.left, key);
        }else
            root.right = insert(root.right, key);
        return root;
    }

    Node min(Node node) {
        Node current = node;
        while (current.left != null){
            current = current.left;
        }
        return current;
    }

    Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key<root.data){
            root.left = delete(root.left, key);
        }else if (key> root.data){
            root.right = delete(root.right, key);
        }else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null)
                return root.left;

            Node successor = min(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    void postOrderTraveral(Node node) {
        if (node == null) return;

        postOrderTraveral(node.left);

        postOrderTraveral(node.right);

        System.out.print(node.data + " ");
    }

    void preOrderTraveral(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");

        preOrderTraveral(node.left);
        preOrderTraveral(node.right);
    }

//    void postOrder(){
//        postOrderTraveral(root);
//    }

    Node search(Node root, int key) {
        if (root == null || root.data == key) return root;
        if (key<root.data)
            return search(root.left, key);

        return search(root.right, key);
    }

    public static void main(String[] args) {
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.root = new Node(27);
//        tree.root.left = new Node(14);
//        tree.root.right = new Node(35);
//        tree.root.left.left = new Node(10);
//        tree.root.left.right = new Node(19);
//        tree.root.right.left = new Node(31);
//        tree.root.right.right = new Node(42);
//
//        System.out.println("Postorder traversal of tree: ");
//        tree.postOrder();

        BinarySearchTree tree = new BinarySearchTree();
        int[] keys = {27, 14, 35, 10, 19, 31, 42};
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }
        System.out.println("Postorder traversal is: ");
        tree.postOrderTraveral(tree.root);
        System.out.println();

        System.out.println("Preorder traversal is: ");
        tree.preOrderTraveral(tree.root);
        System.out.println();

        int searchKey = 19;
        Node result = tree.search(tree.root, searchKey);
        if (result != null) {
            System.out.println("Tim thay node voi gia tri: " + result.data);
        }else {
            System.out.println("Key doesn't exist");
        }

        int keyDelete = 35;
        tree.root = tree.delete(tree.root, keyDelete);
        System.out.println("After deleting key: " + keyDelete + "Postorder traversal is: ");
        tree.postOrderTraveral(tree.root);
    }
}
