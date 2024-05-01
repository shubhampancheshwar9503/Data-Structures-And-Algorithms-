public class InsertionSort {

    public static void main(String[] args) {

        // Initial array
        int[] A = {12, 54, 65, 7, 23, 9};
        int n = 6;
        
        // Print the array before sorting
        printArray(A, n);
        
        // Sort the array using insertion sort
        insertionSort(A, n);
        
        // Print the array after sorting
        printArray(A, n);
    }
    
    // Method to print the elements of an array
    public static void printArray(int[] A, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();
    }
    
    // Method to perform insertion sort
    public static void insertionSort(int[] A, int n) {

        int key, j;
        
        // Loop for passes
        for (int i = 1; i <= n - 1; i++) {

            key = A[i];
            j = i - 1;
            
            // Loop for each pass
            while (j >= 0 && A[j] > key) {

                A[j + 1] = A[j];
                j--;
            }
            
            A[j + 1] = key;
        }

    }

}
