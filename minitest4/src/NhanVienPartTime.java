public class NhanVienPartTime extends NhanVien {
    private int hoursWorked;

    public NhanVienPartTime() {

    }

    public NhanVienPartTime(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public NhanVienPartTime(int ID, String name, int age, String SDT, String email, int hoursWorked) {
        super(ID, name, age, SDT, email);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    @Override
    public int salary() {
        return getHoursWorked() * 100000;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime: " +
                "hoursWorked=" + hoursWorked + ", " +
                super.toString();
    }
}
