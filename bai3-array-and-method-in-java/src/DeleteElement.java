
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        x = sc.nextInt();
        int indexVL = checkIndex(a, x);
        a = deleteValue(a, indexVL);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int checkIndex(int[] arr, int dtValue) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dtValue) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] deleteValue(int[] arr, int indexVL) {
        if (indexVL == -1) {
            return arr;
        }
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < indexVL; i++) {
            newArr[i] = arr[i];
        }
        for (int i = indexVL; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }
}
