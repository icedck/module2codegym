import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap duong dan file nguon: ");
        String sourcePath = in.nextLine();
        System.out.print("Nhap duong dan file copy: ");
        String targetPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("file nguon khong ton tai");
            return;
        }

        if (!targetFile.exists()) {
            System.out.println("file copy khong ton tai");
            return;
        }

        int count = 0;

        try(FileReader reader = new FileReader(sourceFile);
        FileWriter writer = new FileWriter(targetFile)) {
            int character;

            while ((character = reader.read()) != -1){
                writer.write(character);
                count++;
            }
            System.out.println("Copy thanh cong");
            System.out.println("So ky tu da sao chep" + count);
        }catch (IOException e){
            System.out.println("Da xay ra loi" + e.getMessage());
        }
    }
}
