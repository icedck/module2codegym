public class EmployeePartTime extends Employee {
    private int hoursWorked;

    public EmployeePartTime() {

    }

    public EmployeePartTime(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public EmployeePartTime(int ID, String name, int age, String SDT, String email, int hoursWorked) {
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
