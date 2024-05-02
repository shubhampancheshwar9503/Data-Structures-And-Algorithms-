public class BubbleSort {

    public static void main(String[] args) {

        int[] A = {1, 2, 5, 6, 12, 54, 625, 7, 23, 9, 987};
        int n = 11;
        
        printArray(A); // Printing the array before sorting
        bubbleSort(A); // Function to sort the array
        printArray(A); // Printing the array after sorting
        
        int[] B = {1, 2, 5, 6, 12, 54, 625, 7, 23, 9, 987};
        printArray(B);
        bubbleSortAdaptive(B);
        printArray(B);
    }

    public static void printArray(int[] A) {

        for (int i = 0; i < A.length; i++) {

            System.out.print(A[i] + " ");
        }

        System.out.println();
    }

    public static void bubbleSort(int[] A) {

        int temp;
        for (int i = 0; i < A.length - 1; i++) { // For number of passes

            System.out.println("Working on pass number " + (i + 1));
            for (int j = 0; j < A.length - 1 - i; j++) { // For comparison in each pass

                if (A[j] > A[j + 1]) {

                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }

            }

        }

    }

    public static void bubbleSortAdaptive(int[] A) {

        int temp;
        boolean isSorted;
        for (int i = 0; i < A.length - 1; i++) { // For number of passes

            System.out.println("Working on pass number " + (i + 1));
            isSorted = true;
            for (int j = 0; j < A.length - 1 - i; j++) { // For comparison in each pass

                if (A[j] > A[j + 1]) {

                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    isSorted = false;
                }

            }

            if (isSorted) {

                return;
            }

        }

    }

}
