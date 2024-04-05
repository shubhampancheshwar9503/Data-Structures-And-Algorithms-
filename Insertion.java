class Node {

    int data;
    Node next;

    Node(int data) {

        this.data = data;
        this.next = null;
    }

}

public class Main {

    static void linkedListTraversal(Node head) {

        Node ptr = head;
        while (ptr != null) {
            System.out.println("Element : " + ptr.data);
            ptr = ptr.next;
        }

    }

    // Case 1
    static Node insertAtFirst(Node head, int data) {

        Node ptr = new Node(data);
        ptr.next = head;
        return ptr;
    }

    // Case 2
    static Node insertAtIndex(Node head, int data, int index) {

        Node ptr = new Node(data);
        Node p = head;
        int i = 0;

        while (i != index - 1) {

            p = p.next;
            i++;
        }

        ptr.next = p.next;
        p.next = ptr;
        return head;
    }

    // Case 3
    static Node insertAtEnd(Node head, int data) {

        Node ptr = new Node(data);
        Node p = head;

        while (p.next != null) {

            p = p.next;
        }

        p.next = ptr;
        ptr.next = null;
        return head;
    }

    // Case 4
    static Node insertAfterNode(Node head, Node prevNode, int data) {

        Node ptr = new Node(data);
        ptr.next = prevNode.next;
        prevNode.next = ptr;
        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(7);
        Node second = new Node(11);
        Node third = new Node(41);
        Node fourth = new Node(66);

        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Linked List Before Insertion");
        linkedListTraversal(head);
        // head = insertAtFirst(head, 56);
        // head = insertAtIndex(head, 56, 1);
        // head = insertAtEnd(head, 56);
        head = insertAfterNode(head, third, 45);
        System.out.println("\nLinked List After Insertion");
        linkedListTraversal(head);
    }

}
