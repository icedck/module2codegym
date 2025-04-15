import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NhanVien v[] = new NhanVien[4];
        v[0] = new NhanVienFullTime(101, "Unknown1", 27, "0111111111", "a@gmail.com", 200000, 50000, 5000000);
        v[1] = new NhanVienFullTime(102, "Unknown2", 24, "0111112222", "b@gmail.com", 170000, 0, 1000000);
        v[2] = new NhanVienPartTime(103, "Unknown3", 25, "0333333333", "c@gmail.com", 4);
        v[3] = new NhanVienPartTime(104, "Unknown4", 21, "0333344444", "d@gmail.com", 6);

        System.out.println("Luong trung binh: " + Average(v));

        System.out.println("nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty: ");
        salaryLessThanAverageSalary(v);

        System.out.println("số lương phải trả cho tất cả các nhân viên bán thời gian: " + sumPartTime(v));

        List<NhanVienFullTime> nvft = getFullTimeList(v);
        System.out.println("Nhan vien FullTime sap xep theo luong: " + nvft);
    }

    public static List<NhanVienFullTime> getFullTimeList(NhanVien[] v) {
        List<NhanVienFullTime> nvft = new ArrayList<>();
        for (NhanVien vi : v){
            if(vi instanceof NhanVienFullTime){
                nvft.add((NhanVienFullTime)vi);
            }
        }

        nvft.sort(Comparator.comparingDouble(NhanVienFullTime::salary));
        return nvft;
    }

    public static int sumPartTime(NhanVien[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof NhanVienPartTime) {
                sum += ((NhanVienPartTime) v[i]).salary();
            }
        }
        return sum;
    }

    public static void salaryLessThanAverageSalary(NhanVien[] v) {
        for (NhanVien nv : v) {
            if (nv instanceof NhanVienFullTime) {
                if (nv.salary()<Average(v)) {
                    System.out.println(nv);
                }
            }
        }
    }

    public static int Average(NhanVien[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i].salary();
        }
        return sum / v.length;
    }


}