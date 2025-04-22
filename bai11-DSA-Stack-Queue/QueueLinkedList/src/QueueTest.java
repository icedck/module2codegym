public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(20);
        q.enqueue(30);
        q.displayQueue();

        q.enqueue(40);
        q.displayQueue();

        q.dequeue();
        q.displayQueue();
    }
}
