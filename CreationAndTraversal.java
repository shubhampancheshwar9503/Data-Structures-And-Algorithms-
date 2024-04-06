public class Main {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void linkedListTraversal(Node ptr) {

        while (ptr != null) {

            System.out.println("Element : " + ptr.data);
            ptr = ptr.next;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(7);
        Node second = new Node(11);
        Node third = new Node(41);
        Node fourth = new Node(66);

        // Link first and second nodes
        head.next = second;

        // Link second and third nodes
        second.next = third;

        // Link third and fourth nodes
        third.next = fourth;

        // Terminate the list at the third node
        fourth.next = null;

        linkedListTraversal(head);
    }

}
