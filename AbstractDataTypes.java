import java.util.Scanner;

class MyArray {

    int totalSize;
    int usedSize;
    int[] ptr;

    void createArray(int tSize, int uSize) {
        totalSize = tSize;
        usedSize = uSize;
        ptr = new int[tSize];
    }

    void show() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(ptr[i]);
        }

    }

    void setVal() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < usedSize; i++) {
            System.out.print("Enter element " + i + " : ");
            int n = scanner.nextInt();
            ptr[i] = n;
        }

    }

}

public class Main {

    public static void main(String[] args) {

        MyArray marks = new MyArray();
        marks.createArray(10, 2);
        System.out.println("We are running setVal now");
        marks.setVal();

        System.out.println("We are running show now");
        marks.show();
    }

}
