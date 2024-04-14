import java.util.Stack;

public class Main {

    static int precedence(char ch) {

        if (ch == '*' || ch == '/')
            return 3;
        else if (ch == '+' || ch == '-')
            return 2;
        else
            return 0;
    }

    static boolean isOperator(char ch) {

        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    static String infixToPostfix(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        
        for (int i = 0; i < infix.length(); i++) {

            char currentChar = infix.charAt(i);
            
            if (!isOperator(currentChar)) {

                postfix.append(currentChar);
            } else {

                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(currentChar)) {

                    postfix.append(stack.pop());
                }

                stack.push(currentChar);
            }

        }
        
        while (!stack.isEmpty()) {

            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }

    public static void main(String[] args) {

        String infix = "x-y/z-k*d";
        System.out.println("Postfix is " + infixToPostfix(infix));
    }

}
