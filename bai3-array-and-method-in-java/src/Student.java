import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Enter the size of the array: ");
            size = in.nextInt();
            if (size > 30 || size < 1) {
                System.out.println("Size should not exceed 30");
            }
        }while(size > 30|| size < 1);
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= 5 || arr[i] <= 10){
                count++;
            }
        }
        System.out.println(count);
    }
}
