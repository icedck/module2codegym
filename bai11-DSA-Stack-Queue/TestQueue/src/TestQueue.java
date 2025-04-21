import java.util.Queue;
import java.util.LinkedList;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Nguyen Van A");
        queue.offer("Nguyen Van C");
        queue.add("Nguyen Van F");
        queue.offer("Nguyen Van B");

//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
//
//        System.out.println(queue.isEmpty());

        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.contains("Nguyen Van A"));

//        Stack<String> stack = new Stack<>();
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//
//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

    }
}
