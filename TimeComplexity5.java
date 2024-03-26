public class Main {

    public static int isPrime(int n) {

        if (n == 1) {
            return 0;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }

        }

        return 1;
    }

    public static void main(String[] args) {

        int numberToCheck = 17; // Replace with the desired number
        int result = isPrime(numberToCheck);
        if (result == 1) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }

    }

}
