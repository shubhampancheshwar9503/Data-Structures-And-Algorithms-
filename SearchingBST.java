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

    static Node search(Node root, int key) {

        if (root == null || root.data == key) {

            return root;
        }

        if (key < root.data) {

            return search(root.left, key);
        } else {

            return search(root.right, key);
        }

    }

    static void preOrder(Node root) {

        if (root != null) {

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    static void postOrder(Node root) {

        if (root != null) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

    }

    static void inOrder(Node root) {

        if (root != null) {

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    static boolean isBSTUtil(Node root, Node prev) {

        if (root != null) {

            if (!isBSTUtil(root.left, prev)) {

                return false;
            }

            if (prev != null && root.data <= prev.data) {

                return false;
            }

            prev = root;
            return isBSTUtil(root.right, prev);
        }

        return true;
    }

    static boolean isBST(Node root) {

        return isBSTUtil(root, null);
    }

    public static void main(String[] args) {

        Node p = createNode(5);
        Node p1 = createNode(3);
        Node p2 = createNode(6);
        Node p3 = createNode(1);
        Node p4 = createNode(4);

        p.left = p1;
        p.right = p2;
        p1.left = p3;
        p1.right = p4;

        Node n = search(p, 10);
        if (n != null) {

            System.out.println("Found : " + n.data);
        } else {

            System.out.println("Element not Found");
        }

        n = search(p, 3);
        if (n != null) {

            System.out.println("Found : " + n.data);
        } else {

            System.out.println("Element not Found");
        }

    }

}
