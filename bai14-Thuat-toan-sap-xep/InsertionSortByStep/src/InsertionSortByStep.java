import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter values %d : " , i+1);
            list[i] = sc.nextInt();
        }

        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        int pos, x;
        int[] newList = null;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;

            if (newList == null || !Arrays.equals(newList, list)) {
                System.out.println("List after the  " + i + " sort: ");
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + " ");
                }
                System.out.println();
                newList = list.clone();
            }
        }


    }
}
