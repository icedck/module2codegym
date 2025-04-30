import java.io.*;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file source: ");
        String sourcePath = sc.nextLine();
        System.out.print("Enter the file target: ");
        String targetPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        try {
            copyFileBinary(sourceFile,targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void copyFileBinary(File sourceFile, File targetFile) throws IOException {
//        InputStream is = null;
//        OutputStream os = null;
        try (FileInputStream is = new FileInputStream(sourceFile);
             FileOutputStream os = new FileOutputStream(targetFile);) {

            byte[] buffer = new byte[1024];
            int length;
            int totalBytes = 0;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
                totalBytes += length;
            }
            System.out.println("Copied. Total bytes read = " + totalBytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
