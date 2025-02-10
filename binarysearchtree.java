class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Constructor
    BST() {
        root = null;
    }

    // Delete method
    public Node delete(Node root, int key) {
        // Base Case: If the tree is empty
        if (root == null) {
            return root;
        }

        // If the key to be deleted is smaller than the root's data,
        // it lies in the left subtree
        if (key < root.data) {
            root.left = delete(root.left, key);
        }
        // If the key to be deleted is greater than the root's data,
        // it lies in the right subtree
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }
        // If key is the same as the root's data, then this is the node to be deleted
        else {
            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Node has one child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Node has two children
            else {
                // Get the inorder successor (smallest in the right subtree)
                root.data = minValue(root.right);

                // Delete the inorder successor
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    // Utility function to find the smallest value node in a given subtree
    public int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Insert method for testing
    public Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Inorder traversal method for testing the BST
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Testing the delete method
    public static void main(String[] args) {
        BST tree = new BST();

        // Inserting nodes into the BST
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(tree.root);  // Expected: 20 30 40 50 60 70 80
        System.out.println();

        // Deleting a node
        tree.root = tree.delete(tree.root, 20);  // Deleting leaf node
        tree.root = tree.delete(tree.root, 30);  // Deleting node with one child
        tree.root = tree.delete(tree.root, 50);  // Deleting node with two children

        System.out.println("Inorder traversal after deletion:");
        tree.inorder(tree.root);  // Expected: 40 60 70 80
    }
}
