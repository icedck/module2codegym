public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("the number of nodes is: " + tree.getSize());
    }
}
