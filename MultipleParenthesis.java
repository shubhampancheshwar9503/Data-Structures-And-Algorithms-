class Stack {

    int size;
    int top;
    char[] arr;

    Stack(int size) {

        this.size = size;
        this.top = -1;
        this.arr = new char[size];
    }

    boolean isEmpty() {

        return top == -1;
    }

    boolean isFull() {

        return top == size - 1;
    }

    void push(char val) {

        if (isFull()) {

            System.out.println("Stack Overflow! Cannot push " + val + " to the stack");
        } else {

            top++;
            arr[top] = val;
        }

    }

    char pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow! Cannot pop from the stack");
            return '\0';
        } else {

            char val = arr[top];
            top--;
            return val;
        }

    }

    char stackTop() {

        return arr[top];
    }

}

public class Main {

    static boolean match(char a, char b) {

        return (a == '{' && b == '}') || (a == '(' && b == ')') || (a == '[' && b == ']');
    }

    static boolean parenthesisMatch(String exp) {

        Stack stack = new Stack(100);

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {

                    return false;
                }

                char poppedCh = stack.pop();
                if (!match(poppedCh, ch)) {

                    return false;
                }

            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String exp1 = "[4-6]((8){(9-8)})";
        String exp2 = "((8){(9-8)})";
        String exp3 = "[[4-6]((8){(9-8])})";

        // Check if parenthesis is balanced for exp1
        if (parenthesisMatch(exp1)) {

            System.out.println("The parenthesis is balanced for exp1");
        } else {

            System.out.println("The parenthesis is not balanced for exp1");
        }

        // Check if parenthesis is balanced for exp2
        if (parenthesisMatch(exp2)) {


            System.out.println("The parenthesis is balanced for exp2");
        } else {

            System.out.println("The parenthesis is not balanced for exp2");
        }

        // Check if parenthesis is balanced for exp3
        if (parenthesisMatch(exp3)) {

            System.out.println("The parenthesis is balanced for exp3");
        } else {

            System.out.println("The parenthesis is not balanced for exp3");
        }

    }

}
