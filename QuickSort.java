public class QuickSort {

    public static void main(String[] args) {

        // Input Array
        int[] A = {9, 4, 4, 8, 7, 5, 6};
        int n = A.length; // Dynamically determine the length of the array

        // Printing the array before sorting
        printArray(A, n);

        // Sorting the array using quick sort algorithm
        quickSort(A, 0, n - 1);

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

    // Method to perform quick sort
    public static void quickSort(int[] A, int low, int high) {

        int partitionIndex; // Index of pivot after partition

        if (low < high) {

            partitionIndex = partition(A, low, high);
            quickSort(A, low, partitionIndex - 1);  // sort left subarray
            quickSort(A, partitionIndex + 1, high); // sort right subarray
        }

    }

    // Method to partition the array
    public static int partition(int[] A, int low, int high) {

        int pivot = A[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {

            while (i <= j && A[i] <= pivot) {

                i++;
            }

            while (A[j] > pivot) {

                j--;
            }

            if (i < j) {

                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }

        } while (i <= j);

        // Swap A[low] and A[j]
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        return j;
    }

}
