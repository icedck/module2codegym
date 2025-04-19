public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addFirst("three");
        list.addFirst("two");
        list.addFirst("one");
        list.addLast("four");

        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.contains("three"));

        list.remove("two");
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        MyLinkedList<String> cloneList = (MyLinkedList<String>) list.clone();
        for (int i=0; i<cloneList.size();i++){
            System.out.println(cloneList.get(i));
        }
    }
}
