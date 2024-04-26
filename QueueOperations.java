public class Main {

    static class Queue {

        int size;
        int f;
        int r;
        int[] arr;

        Queue(int size) {

            this.size = size;
            this.f = this.r = 0;
            this.arr = new int[size];
        }

        boolean isEmpty() {

            return r == f;
        }

        boolean isFull() {

            return r == size - 1;
        }

        void enqueue(int val) {

            if (isFull()) {

                System.out.println("This Queue is Full");
            } else {

                r++;
                arr[r] = val;
                System.out.println("Enqueued Element : " + val);
            }

        }

        int dequeue() {

            int a = -1;
            if (isEmpty()) {

                System.out.println("This Queue is Empty");
            } else {

                f++;
                a = arr[f];
            }

            return a;
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue(4);
        
        // Enqueue few elements
        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(1); 
        
        System.out.println("Dequeuing Element " + q.dequeue());
        System.out.println("Dequeuing Element " + q.dequeue());
        System.out.println("Dequeuing Element " + q.dequeue()); 
        
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);

        if (q.isEmpty()) {

            System.out.println("Queue is Empty");
        }
        if (q.isFull()) {

            System.out.println("Queue is Eull");
        }
        
        if (q.isEmpty()) {

            System.out.println("Queue is Empty");
        }

        q.enqueue(12);
        q.enqueue(15);
        System.out.println("Dequeuing Element " + q.dequeue());
        System.out.println("Dequeuing Element " + q.dequeue());
    }

}
