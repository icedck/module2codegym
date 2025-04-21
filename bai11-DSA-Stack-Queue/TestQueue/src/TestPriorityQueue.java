import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();

        queue.offer("Nguyen Van A");
        queue.offer("Nguyen Van C");
        queue.add("Nguyen Van F");
        queue.offer("Nguyen Van B");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
