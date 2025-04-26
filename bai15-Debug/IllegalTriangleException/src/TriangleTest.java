import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap canh 1: ");
            float a = sc.nextFloat();
            System.out.print("Nhap canh 2: ");
            float b = sc.nextFloat();
            System.out.print("Nhap canh 3: ");
            float c = sc.nextFloat();

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Độ dài cạnh không thể là số âm hoặc bằng 0.");
            }

            if (a + b <= c || b + c <= a || c + a <= b) {
                throw new IllegalTriangleException("Tổng của hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
            }

            System.out.println("Day la tam giac");

        }catch (IllegalTriangleException e){
            System.err.println("Lỗi: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.err.println("Lỗi: Giá trị nhập vào không phải là số.");
        }
    }
}
