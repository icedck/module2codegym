public class MyQueue {
    private int capacity;
    private int[] array;
    private int head = 0;
    private int tail = -1;
    private int size = 0;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (size == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (size == 0) {
            status = true;
        }
        return status;
    }

    public void enQueue(int value) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        }else {
            tail = (tail + 1) % capacity;
            array[tail] = value;
            size++;
            System.out.println("Enqueue " + value);
        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        }else {
            head++;
            if (head == capacity - 1) {
                System.out.println("removed: " + array[head - 1]);
                head = 0;
            }else {
                System.out.println("removed: " + array[head - 1]);
            }
            size--;
        }
    }
}
