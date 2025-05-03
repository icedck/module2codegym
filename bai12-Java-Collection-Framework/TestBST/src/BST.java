public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E element) {
        if (root == null) {
            root = createNode(element);
        }else {
            TreeNode<E> current = root;
            TreeNode<E> parent = null;
            while (current != null) {
                if (element.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                }else if (element.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }else {
                    return false;
                }
            }
            if(element.compareTo(parent.element) < 0) {
                parent.left = createNode(element);
            }else {
                parent.right = createNode(element);
            }
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNode(E element) {
        return new TreeNode<>(element);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
