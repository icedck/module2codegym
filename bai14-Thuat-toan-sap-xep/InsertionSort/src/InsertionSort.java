public class InsertionSort {
    static int[] list = {1,78,-5,-3,22,15};
    public static void insertionSort(int[] list) {
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
