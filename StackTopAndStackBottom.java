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

                System.out.println("Stack Overflow! Cannot push " + val + " to the Stack");
            } else {

                top++;
                arr[top] = val;
            }

        }

        int pop() {

            if (isEmpty()) {

                System.out.println("Stack Underflow! Cannot pop from the Stack");
                return -1;
            } else {

                int val = arr[top];
                top--;
                return val;
            }

        }

        int peek(int i) {

            int arrayInd = top - i + 1;
            if (arrayInd < 0) {
                System.out.println("Not a Valid Position for the Stack");
                return -1;
            } else {

                return arr[arrayInd];
            }

        }

        int stackTop() {

            return arr[top];
        }

        int stackBottom() {

            return arr[0];
        }

    }

    public static void main(String[] args) {

        Stack sp = new Stack(50);
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
        sp.push(6);
        sp.push(5);
        sp.push(75);

        // Printing the topmost and bottommost values of the stack
        System.out.println("The TopMost Value of this Stack is " + sp.stackTop());
        System.out.println("The BottomMost Value of this Stack is " + sp.stackBottom());
    }

}
