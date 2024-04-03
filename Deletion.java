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
    
    // Case 1: Deleting the first element from the linked list
    static Node deleteFirst(Node head) {

        Node ptr = head;
        head = head.next;
        ptr = null; // releasing memory
        return head;
    }
    
    // Case 2: Deleting the element at a given index from the linked list
    static Node deleteAtIndex(Node head, int index) {

        Node p = head;
        Node q = head.next;
        for (int i = 0; i < index - 1; i++) {
            p = p.next;
            q = q.next;
        }
        
        p.next = q.next;
        q = null; // releasing memory
        return head;
    }
    
    // Case 3: Deleting the last element
    static Node deleteAtLast(Node head) {

        Node p = head;
        Node q = head.next;
        while (q.next != null) {

            p = p.next;
            q = q.next;
        }
        
        p.next = null;
        q = null; // releasing memory
        return head;
    }
    
    // Case 4: Deleting the element with a given value from the linked list
    static Node deleteWithValue(Node head, int value) {

        Node p = head;
        Node q = head.next;
        while (q.data != value && q.next != null) {

            p = p.next;
            q = q.next;
        }
        
        if (q.data == value) {

            p.next = q.next;
            q = null; // releasing memory
        }

        return head;
    }
    
    public static void main(String[] args) {

        Node head = new Node(4);
        Node second = new Node(3);
        Node third = new Node(8);
        Node fourth = new Node(1);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        
        System.out.println("Linked List Before Deletion");
        linkedListTraversal(head);
        
        // head = deleteFirst(head); // For deleting first element of the linked list
        // head = deleteAtIndex(head, 2);
        head = deleteAtLast(head);
        
        System.out.println("Linked List After Deletion");
        linkedListTraversal(head);
    }

}
