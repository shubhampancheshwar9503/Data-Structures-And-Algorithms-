class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class Main {

    public static Node createNode(int data) {

        return new Node(data);
    }

    public static void main(String[] args) {

        // Constructing the root node - Using Function (Recommended)
        Node p = createNode(2);
        Node p1 = createNode(1);
        Node p2 = createNode(4);

        // Linking the root node with left and right children
        p.left = p1;
        p.right = p2;
    }

}
