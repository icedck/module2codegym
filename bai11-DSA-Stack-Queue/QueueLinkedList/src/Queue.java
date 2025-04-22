public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            this.front = this.rear= temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
        this.rear.link = this.front;
    }

    public Node dequeue() {
        if (isEmpty()) return null;
        Node temp = this.front;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
        return temp;
    }


    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng.");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}
