class Main {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {

            this.data = data;
            left = right = null;
        }

    }

    static Node createNode(int data) {

        return new Node(data);
    }

    static void preOrder(Node root) {

        if (root != null) {

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    static void inOrder(Node root) {

        if (root != null) {

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    static Node insert(Node root, int key) {

        if (root == null) {

            return createNode(key);
        }

        if (key < root.data) {

            root.left = insert(root.left, key);
        } else if (key > root.data) {

            root.right = insert(root.right, key);
        }

        return root;
    }

    static Node inOrderPredecessor(Node root) {

        root = root.left;
        while (root.right != null) {

            root = root.right;
        }

        return root;
    }

    static Node deleteNode(Node root, int value) {

        if (root == null) {

            return null;
        }

        if (root.left == null && root.right == null) {

            if (root.data == value) {

                return null;
            }

            return root;
        }

        if (value < root.data) {

            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {

            root.right = deleteNode(root.right, value);
        } else {

            Node iPre = inOrderPredecessor(root);
            root.data = iPre.data;
            root.left = deleteNode(root.left, iPre.data);
        }

        return root;
    }

    public static void main(String[] args) {

        // Constructing the root node
        Node p = createNode(5);
        Node p1 = createNode(3);
        Node p2 = createNode(6);
        Node p3 = createNode(1);
        Node p4 = createNode(4);

        // Linking the root node with left and right children
        p.left = p1;
        p.right = p2;
        p1.left = p3;
        p1.right = p4;

        inOrder(p);
        System.out.println();
        deleteNode(p, 3);
        inOrder(p);
    }

}
