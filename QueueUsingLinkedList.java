public class Queue {

    static Node f = null;
    static Node r = null;

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        linkedListTraversal(f);
        System.out.println("Dequeuing element " + dequeue());
        enqueue(34);
        enqueue(4);
        enqueue(7);
        enqueue(17);
        System.out.println("Dequeuing element " + dequeue());
        System.out.println("Dequeuing element " + dequeue());
        System.out.println("Dequeuing element " + dequeue());
        System.out.println("Dequeuing element " + dequeue());
        linkedListTraversal(f);
    }

    public static void enqueue(int val) {

        Node n = new Node(val);
        if (n == null) {

            System.out.println("Queue is Full");
        } else {

            if (f == null) {

                f = r = n;
            } else {

                r.next = n;
                r = n;
            }

        }

    }

    public static int dequeue() {

        int val = -1;
        if (f == null) {

            System.out.println("Queue is Empty");
        } else {

            Node ptr = f;
            f = f.next;
            val = ptr.data;
            ptr = null;
        }

        return val;
    }

    public static void linkedListTraversal(Node ptr) {

        System.out.println("Printing the elements of this linked list");
        while (ptr != null) {

            System.out.println("Element: " + ptr.data);
            ptr = ptr.next;
        }

    }

}
