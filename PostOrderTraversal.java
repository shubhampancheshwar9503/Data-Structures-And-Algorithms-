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

    static void postOrder(Node root) {

        if (root != null) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

    }

    public static void main(String[] args) {

        Node p = createNode(4);
        Node p1 = createNode(1);
        Node p2 = createNode(6);
        Node p3 = createNode(5);
        Node p4 = createNode(2);

        p.left = p1;
        p.right = p2;
        p1.left = p3;
        p1.right = p4;

        preOrder(p);
        System.out.println();
        postOrder(p);
    }

}
