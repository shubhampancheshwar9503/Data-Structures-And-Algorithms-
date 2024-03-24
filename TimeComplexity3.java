import java.util.Random;

public class Main {

    public static int function(int n) {

        if (n <= 0) {
            return 0;
        } else {
            Random rand = new Random();
            int i = rand.nextInt(n);
            System.out.println("this");
            return function(i) + function(n - 1 - i);
        }

    }

    public static void main(String[] args) {

        int n = 10; // Replace with the desired value of n
        int result = function(n);
        System.out.println("Result : " + result);
    }

}
