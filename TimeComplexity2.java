public class Main {

    public static void func(int n) {

        int sum = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d , %d%n", i, j);
            }

        }

    }

    public static void main(String[] args) {

        int n = 3; // Replace with the desired value of n
        func(n);
    }

}
