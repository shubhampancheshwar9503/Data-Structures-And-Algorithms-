public class CircularQueue {

    private int size;
    private int f;
    private int r;
    private int[] arr;

    public CircularQueue(int size) {

        this.size = size;
        this.f = this.r = 0;
        this.arr = new int[size];
    }

    public boolean isEmpty() {

        return this.r == this.f;
    }

    public boolean isFull() {

        return (this.r + 1) % this.size == this.f;
    }

    public void enqueue(int val) {

        if (isFull()) {

            System.out.println("This Queue is full");
        } else {

            this.r = (this.r + 1) % this.size;
            this.arr[this.r] = val;
            System.out.println("Enqueued element: " + val);
        }

    }

    public int dequeue() {

        int a = -1;
        if (isEmpty()) {

            System.out.println("This Queue is empty");
        } else {

            this.f = (this.f + 1) % this.size;
            a = this.arr[this.f];
        }

        return a;
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(4);
        
        // Enqueue few elements
        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(1);

        System.out.println("Dequeuing element " + q.dequeue());
        System.out.println("Dequeuing element " + q.dequeue());
        System.out.println("Dequeuing element " + q.dequeue());

        // Enqueue more elements
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);

        if (q.isEmpty()) {

            System.out.println("Queue is empty");
        }

        if (q.isFull()) {

            System.out.println("Queue is full");
        }

    }

}
