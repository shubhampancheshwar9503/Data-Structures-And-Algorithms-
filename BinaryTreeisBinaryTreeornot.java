import java.util.*;

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

    static boolean isBST(Node root) {

        Stack<Node> stack = new Stack<>();
        Node prev = null;

        while (root != null || !stack.isEmpty()) {

            while (root != null) {

                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (prev != null && root.data <= prev.data)
                return false;
            prev = root;
            root = root.right;
        }

        return true;
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

        inOrder(p);
        System.out.println();

        if (isBST(p)) {

            System.out.println("This is a BST");
        } else {

            System.out.println("This is not a BST");
        }

    }

}
