import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu ");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            list.add(scanner.nextInt());
        }
        list.sort(Integer::compareTo);
        System.out.println(list);

        System.out.println("Nhap phan tu can tim: ");
        int times = scanner.nextInt();
        int index = binarySearch(list, 0, list.size() - 1, times);
        if (index != -1) {
            System.out.println("phan tu " + times + " da dc tim thay tai vi tri " + index);
        }else {
            System.out.println("phan tu " + times + " ko ton tai ");
        }
    }

    static int binarySearch(ArrayList<Integer> array, int left, int right ,int value){
        if (left <= right){
            int mid = (left + right) / 2;
            if (array.get(mid) == value){
                return mid;
            }else if (array.get(mid) > value){
                return binarySearch(array, left, mid - 1, value);
            }else {
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }
}
