import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rand = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Creating random array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        Integer[] arr = example.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int n = sc.nextInt();

        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + n + " là " + arr[n]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
