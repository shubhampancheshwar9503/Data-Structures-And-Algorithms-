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
        do {

            System.out.println("Element is " + ptr.data);
            ptr = ptr.next;
        } while (ptr != head);

    }

    static Node insertAtBeginning(Node head, int data) {

        Node newNode = new Node(data);
        if (head == null) {

            newNode.next = newNode;
            return newNode;
        }

        Node last = head;
        while (last.next != head) {

            last = last.next;
        }

        newNode.next = head;
        last.next = newNode;
        return newNode;
    }

    public static void main(String[] args) {

        Node head = null;

        // Create circular linked list before insertion
        head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(1);
        head.next.next.next.next = head;

        System.out.println("Circular Linked List Before Insertion");
        linkedListTraversal(head);

        // Inserting new elements at the beginning
        head = insertAtBeginning(head, 54);
        head = insertAtBeginning(head, 58);
        head = insertAtBeginning(head, 59);

        System.out.println("Circular Linked List After Insertion");
        linkedListTraversal(head);
    }

}
