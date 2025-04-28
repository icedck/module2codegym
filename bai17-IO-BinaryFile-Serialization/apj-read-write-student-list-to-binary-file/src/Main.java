import java.io.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeStudentListToBinaryFile("bai17-IO-BinaryFile-Serialization/apj-read-write-student-list-to-binary-file/src/student.txt",students);
        List<Student> studentDataFromFile = readStudentListFromBinaryFile("bai17-IO-BinaryFile-Serialization/apj-read-write-student-list-to-binary-file/src/student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static void writeStudentListToBinaryFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readStudentListFromBinaryFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}