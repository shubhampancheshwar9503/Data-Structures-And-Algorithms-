public class Main {

    static int linearSearch(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }

        }

        return -1;
    }

    static int binarySearch(int[] arr, int size, int element) {

        int low, mid, high;
        low = 0;
        high = size - 1;
        // Keep searching until low <= high
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == element) {

                return mid;
            }

            if (arr[mid] < element) {

                low = mid + 1;
            } else {

                high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        // Sorted array for binary search
        int[] arr = {1, 3, 5, 56, 64, 73, 123, 225, 444};
        int size = arr.length;
        int element = 444;
        int searchIndex = binarySearch(arr, size, element);
        System.out.println("The Element " + element + " Was Found At Index " + searchIndex);
    }

}
