import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ghi file với một OutputStream
        try (FileOutputStream output = new FileOutputStream("C:\\module2codegym\\bai17-IO-BinaryFile-Serialization\\src\\temp.txt")) {
            //ghi từng giá trị với vòng lặp 1 -> 10
            for (int i = 0; i < 10; i++) {
                output.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc file với một InputStream
        try (FileInputStream input = new FileInputStream("C:\\module2codegym\\bai17-IO-BinaryFile-Serialization\\src\\temp.txt")) {
            int value;
            //đọc giá trị với vòng lặp
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("C:\\book");
        File file2 = new File("C:\\book\\test.dat");

        file.isDirectory(); // true nếu là thư mục
        file.isFile();      // true nếu là file
    }
}
