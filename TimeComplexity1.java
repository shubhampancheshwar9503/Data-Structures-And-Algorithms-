public class Main {

    public static void func1(int[] array) {

        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }

    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 66};
        func1(arr);
    }

}