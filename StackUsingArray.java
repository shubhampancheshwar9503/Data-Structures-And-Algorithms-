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

    }

    public static void main(String[] args) {

        Stack s = new Stack(80);

        // Check if stack is empty
        if (s.isEmpty()) {

            System.out.println("The Stack is Empty");
        } else {

            System.out.println("The Stack is not Empty");
        }

        // Pushing an element manually
        s.arr[0] = 7;
        s.top++;

        // Check if stack is empty
        if (s.isEmpty()) {

            System.out.println("The Stack is Empty");
        } else {

            System.out.println("The Stack is not Empty");
        }

    }

}
