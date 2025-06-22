public class BinarySearchTree {
    private Node root;

    private static class Node {
        int key;
        Node left, right;
        Node(int key) { this.key = key; }
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }

    public boolean search(int key) {
        return searchRec(root, key) != null;
    }

    private Node searchRec(Node root, int key) {
        if (root == null || root.key == key) return root;
        if (key < root.key) return searchRec(root.left, key);
        return searchRec(root.right, key);
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        System.out.print("Inorder traversal: ");
        bst.inorder();
        System.out.println("Search 40? " + bst.search(40));
        System.out.println("Search 100? " + bst.search(100));
    }
}
