public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("Welcome to MyLinkedList");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.add(3, 7);
        ll.print();
    }
}
