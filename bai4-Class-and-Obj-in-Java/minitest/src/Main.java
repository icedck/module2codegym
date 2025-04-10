import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s[] = {new Student("a00", "A", 12, "a@gmail.com", 5),
                new Student("b00", "B", 15, "b@gmail.com", 8),
                new Student("c00", "C", 14, "c@gmail.com", 7),
                new Student("d00", "D", 13, "d@gmail.com", 6),
                new Student("e00", "E", 11, "e@gmail.com", 9)
        };
        System.out.println("Trung binh tuoi : " + avarageAge(s));
        System.out.println("So ban tren 5 diem : " + Grade(s));
        for (int i = 0; i <s.length;i++){
            if (s[i].getName().equals("A")){
                System.out.println("Email của A: " + s[i].getEmail());
                break;
            }
        }
    }

    public static float avarageAge(Student arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        return sum / arr.length;
    }

    public static float Grade(Student arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getGrade() > 5){
                count++;
            }
        }
        return count;
    }

}