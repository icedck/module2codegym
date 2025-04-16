import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee v[] = new Employee[4];
        v[0] = new EmployeeFullTime(101, "Unknown1", 27, "0111111111", "a@gmail.com", 200000, 50000, 5000000);
        v[1] = new EmployeeFullTime(102, "Unknown2", 24, "0111112222", "b@gmail.com", 170000, 0, 1000000);
        v[2] = new EmployeePartTime(103, "Unknown3", 25, "0333333333", "c@gmail.com", 4);
        v[3] = new EmployeePartTime(104, "Unknown4", 21, "0333344444", "d@gmail.com", 6);

        System.out.println("Luong trung binh: " + Average(v));

        System.out.println("nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty: ");
        salaryLessThanAverageSalary(v);

        System.out.println("số lương phải trả cho tất cả các nhân viên bán thời gian: " + sumPartTime(v));

        List<EmployeeFullTime> arrEmployeeFullTime = getFullTimeList(v);
        System.out.println("Nhan vien FullTime sap xep theo luong: " + arrEmployeeFullTime);
    }

    public static List<EmployeeFullTime> getFullTimeList(Employee[] v) {
        List<EmployeeFullTime> arrEmployeeFullTime = new ArrayList<>();
        for (Employee vi : v){
            if(vi instanceof EmployeeFullTime){
                arrEmployeeFullTime.add((EmployeeFullTime)vi);
            }
        }
        arrEmployeeFullTime.sort(Comparator.comparingDouble(EmployeeFullTime::salary));
        return arrEmployeeFullTime;
    }

    public static int sumPartTime(Employee[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof EmployeePartTime) {
                sum += ((EmployeePartTime) v[i]).salary();
            }
        }
        return sum;
    }

    public static void salaryLessThanAverageSalary(Employee[] v) {
        for (Employee nv : v) {
            if (nv instanceof EmployeeFullTime) {
                if (nv.salary()<Average(v)) {
                    System.out.println(nv);
                }
            }
        }
    }

    public static int Average(Employee[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i].salary();
        }
        return sum / v.length;
    }


}