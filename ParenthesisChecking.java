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

            System.out.println("Stack Overflow! Cannot push " + val + " to the Stack");
        } else {

            top++;
            arr[top] = val;
        }

    }

    char pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow! Cannot pop from the Stack");
            return '\0';
        } else {

            char val = arr[top];
            top--;
            return val;
        }

    }

}

public class Main {

    static boolean parenthesisMatch(String exp) {

        Stack stack = new Stack(100);

        for (int i = 0; i < exp.length(); i++) {

            if (exp.charAt(i) == '(') {

                stack.push('(');
            } else if (exp.charAt(i) == ')') {

                if (stack.isEmpty()) {

                    return false;
                }

                stack.pop();
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String exp1 = "((8)(*--$$9))";
        String exp2 = "8)*(9)";

        // Check if parenthesis is matching for exp1
        if (parenthesisMatch(exp1)) {

            System.out.println("The Parenthesis is Matching for exp1");
        } else {

            System.out.println("The Parenthesis is not Matching for exp1");
        }

        // Check if parenthesis is matching for exp2
        if (parenthesisMatch(exp2)) {

            System.out.println("The Parenthesis is Matching for exp2");
        } else {

            System.out.println("The Parenthesis is not Matching for exp2");
        }

    }

}
