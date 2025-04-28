import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = sc.nextLine();
        System.out.println("Enter destination file: ");
        String destinationPath = sc.nextLine();

        File source = new File(sourcePath);
        File destination = new File(destinationPath);

        try {
//            copyFileUsingJava7Files(source, destination);
            copyFileUsingStream(source, destination);
            System.out.printf("Copy completed");
        }catch (IOException e) {
            System.out.printf("Can't copy that file");
            System.out.printf(e.getMessage());
        }
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }
    }
}