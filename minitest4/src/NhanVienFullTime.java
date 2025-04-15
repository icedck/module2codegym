public class NhanVienFullTime extends NhanVien {
    private int prizeAmount;
    private int fineAmount;
    private int fixedSalary;

    public NhanVienFullTime() {

    }

    public NhanVienFullTime(int prizeAmount, int fineAmount, int fixedSalary) {
        this.prizeAmount = prizeAmount;
        this.fineAmount = fineAmount;
        this.fixedSalary = fixedSalary;
    }

    public NhanVienFullTime(int ID, String name, int age, String SDT, String email, int prizeAmount, int fineAmount, int fixedSalary) {
        super(ID, name, age, SDT, email);
        this.prizeAmount = prizeAmount;
        this.fineAmount = fineAmount;
        this.fixedSalary = fixedSalary;
    }

    public int getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(int prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public int salary() {
        return getFixedSalary() + (getPrizeAmount() - getFineAmount());
    }

    @Override
    public String toString() {
        return "NhanVienFullTime: " +
                "prizeAmount=" + prizeAmount +
                ", fineAmount=" + fineAmount +
                ", fixedSalary=" + fixedSalary + ", " +
                super.toString();
    }
}
