class Node {

    int data;
    Node next;
    Node prevNode;

    Node(int data) {

        this.data = data;
        this.next = null;
        this.prevNode = null;
    }

}

public class Main {

    static void traversal(Node N1) {

        Node p = N1;
        while (p != null) {

            System.out.println(p.data);
            p = p.next;
        }

    }

    static void reverse(Node N4) {

        Node p = N4;
        while (p.prevNode != null) {

            System.out.println(p.data);
            p = p.prevNode;
        }

        System.out.println(p.data);
    }

    public static void main(String[] args) {

        Node N1, N2, N3, N4;

        N1 = new Node(10);
        N2 = new Node(14);
        N3 = new Node(20);
        N4 = new Node(35);

        N1.prevNode = null;
        N1.next = N2;

        N2.prevNode = N1;
        N2.next = N3;

        N3.prevNode = N2;
        N3.next = N4;

        N4.prevNode = N3;
        N4.next = null;

        System.out.println("In Order List :");
        traversal(N1);
        System.out.println("Reverse Order List :");
        reverse(N4);
    }

}
