import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        int size;
        int arr1[];
        int arr2[];
        int arr3[];
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);
        arr1 = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter element arr1 " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        arr2 = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter element arr2 " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        arr3 = combineArray(arr1, arr2);
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] combineArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for(int i = arr1.length; i < arr2.length + arr1.length; i++) {
            newArr[i] = arr2[i-arr1.length];
        }
        return newArr;
    }
}
