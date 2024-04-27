public class MergeSort {

    public static void main(String[] args) {

        // Input Array
        int[] A = {9, 1, 4, 14, 4, 15, 6};
        int n = 7;

        // Printing the array before sorting
        printArray(A, n);

        // Sorting the array using merge sort algorithm
        mergeSort(A, 0, n - 1);

        // Printing the array after sorting
        printArray(A, n);
    }

    // Method to print the elements of an array
    public static void printArray(int[] A, int n) {

        for (int i = 0; i < n; i++) {

            System.out.print(A[i] + " ");
        }

        System.out.println();
    }

    // Method to perform merge sort
    public static void mergeSort(int[] A, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;
            mergeSort(A, low, mid);
            mergeSort(A, mid + 1, high);
            merge(A, low, mid, high);
        }

    }

    // Method to merge two sorted subarrays
    public static void merge(int[] A, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;
        int[] B = new int[A.length]; // Auxiliary array for merging

        while (i <= mid && j <= high) {

            if (A[i] < A[j]) {

                B[k] = A[i];
                i++;
            } else {

                B[k] = A[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {

            B[k] = A[i];
            i++;
            k++;
        }

        while (j <= high) {

            B[k] = A[j];
            j++;
            k++;
        }

        // Copying elements from B back to A
        for (int index = low; index <= high; index++) {

            A[index] = B[index];
        }

    }

}
