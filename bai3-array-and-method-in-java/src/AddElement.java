import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int x,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to be added");
        x = sc.nextInt();
        System.out.println("Enter element to be added");
        n = sc.nextInt();
        a = addElement(a, x, n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] addElement(int[] arr, int addValue, int value) {
        if (addValue <= -1 ||addValue >= arr.length-1) {
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < addValue; i++) {
            newArr[i] = arr[i];
        }
        newArr[addValue] = value;
        for (int i = addValue ; i < arr.length ; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
}
