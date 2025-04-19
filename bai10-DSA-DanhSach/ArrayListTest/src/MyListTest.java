public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("list size: " + list.size());
        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list.get(1));

        System.out.println(list.contains("a"));
        System.out.println(list.indexOf("c"));

        list.clear();
        System.out.println(list.size());
    }
}
