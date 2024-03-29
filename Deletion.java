public class Main {

    static void display(int[] arr, int n) {

        // Code for Traversal
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void indDeletion(int[] arr, int size, int index) {

        // code for Deletion
        for (int i = index; i < size - 1; i++) {

            arr[i] = arr[i + 1];
        }

    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 12, 27, 88};
        int size = 5, element = 45, index = 0;
        display(arr, size);
        indDeletion(arr, size, index);
        size -= 1;
        display(arr, size);
    }

}
