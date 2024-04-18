public class Main {

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }

    }

    static boolean isEmpty(Node top) {

        return top == null;
    }

    static boolean isFull() {

        // Java doesn't have a direct way to check if memory is full like C's malloc.
        // So, we'll assume memory allocation succeeds.
        return false;
    }

    static Node push(Node top, int x) {

        if (isFull()) {

            System.out.println("Stack Overflow");
            return top;
        } else {

            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
            return top;
        }

    }

    static int pop(Node[] top) {

        Node temp = top[0];
        if (isEmpty(temp)) {

            System.out.println("Stack Underflow");
            return -1;
        } else {

            int x = temp.data;
            top[0] = temp.next;
            temp = null; // Free the memory
            return x;
        }

    }

    static void linkedListTraversal(Node ptr) {

        while (ptr != null) {

            System.out.println("Element : " + ptr.data);
            ptr = ptr.next;
        }

    }

    public static void main(String[] args) {

        Node[] top = new Node[1]; // Used an array to simulate pass by reference in Java
        top[0] = null;

        top[0] = push(top[0], 78);
        top[0] = push(top[0], 7);
        top[0] = push(top[0], 8);

        // linkedListTraversal(top[0]);

        int element = pop(top);
        System.out.println("Popped Element is " + element);
        linkedListTraversal(top[0]);
    }

}
