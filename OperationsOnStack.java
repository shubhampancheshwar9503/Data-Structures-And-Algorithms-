class Node {

    int data;
    Node next;

    Node(int data) {

        this.data = data;
        this.next = null;
    }

}

class Stack {

    Node top;

    boolean isEmpty() {

        return top == null;
    }

    boolean isFull() {

        Node p = new Node(0); // Trying to allocate memory
        return p == null;
    }

    Node push(Node top, int x) {

        if (isFull()) {

            System.out.println("Stack Overflow");
        } else {

            Node n = new Node(x);
            n.next = top;
            top = n;
        }

        return top;
    }

    int pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return -1;
        } else {

            Node n = top;
            top = top.next;
            return n.data;
        }

    }

    int peek(int pos) {

        Node ptr = top;
        for (int i = 0; i < pos - 1 && ptr != null; i++) {

            ptr = ptr.next;
        }

        if (ptr != null) {

            return ptr.data;
        } else {

            return -1;
        }

    }

}

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.top = stack.push(stack.top, 28);
        stack.top = stack.push(stack.top, 18);
        stack.top = stack.push(stack.top, 15);
        stack.top = stack.push(stack.top, 7);

        Node ptr = stack.top;
        while (ptr != null) {

            System.out.println("Element : " + ptr.data);
            ptr = ptr.next;
        }

        for (int i = 1; i <= 4; i++) {

            System.out.println("Value at Position " + i + " is : " + stack.peek(i));
        }

    }

}
