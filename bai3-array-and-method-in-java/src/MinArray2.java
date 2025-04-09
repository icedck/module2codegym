import java.util.Scanner;

public class MinArray2 {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20|| size < 1){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20|| size < 1);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int min = minArray(array);
        System.out.println("Min element is " + min);
    }
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
