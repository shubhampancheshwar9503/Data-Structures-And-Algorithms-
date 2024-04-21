public class Main {

    static class Stack {

        int size;
        int top;
        int[] arr;

        Stack(int size) {

            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }

        boolean isEmpty() {

            return top == -1;
        }

        boolean isFull() {

            return top == size - 1;
        }

        void push(int val) {

            if (isFull()) {

                System.out.printf("Stack Overflow! Cannot Push %d to the Stack\n", val);
            } else {

                top++;
                arr[top] = val;
            }

        }

        int pop() {

            if (isEmpty()) {

                System.out.println("Stack Underflow! Cannot Pop from the Stack");
                return -1;
            } else {

                int val = arr[top];
                top--;
                return val;
            }

        }

    }

    public static void main(String[] args) {

        Stack sp = new Stack(10);
        System.out.println("Stack has been Created Successfully");

        System.out.println("Before Pushing, Full : " + sp.isFull());
        System.out.println("Before Pushing, Empty : " + sp.isEmpty());

        sp.push(1);
        sp.push(23);
        sp.push(99);
        sp.push(75);
        sp.push(3);
        sp.push(64);
        sp.push(57);
        sp.push(46);
        sp.push(89);
        sp.push(6); // Pushed 10 values 

        // sp.push(46); // Stack Overflow since the size of the stack is 10

        System.out.println("After Pushing, Full : " + sp.isFull());
        System.out.println("After Pushing, Empty : " + sp.isEmpty());

        System.out.println("Popped " + sp.pop() + " from the Stack"); // Last in first out!
        System.out.println("Popped " + sp.pop() + " from the Stack"); // Last in first out!
        System.out.println("Popped " + sp.pop() + " from the Stack"); // Last in first out!
    }

}
