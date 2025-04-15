public abstract class NhanVien {
    private int ID;
    private String Name;
    private int Age;
    private String SDT;
    private String Email;

    public NhanVien(){

    }

    public NhanVien(int ID, String name, int age, String SDT, String email) {
        this.ID = ID;
        this.Name = name;
        this.Age = age;
        this.SDT = SDT;
        this.Email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public abstract int salary();

    @Override
    public String toString() {
        return "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", SDT='" + SDT + '\'' +
                ", Email='" + Email + '\'';
    }
}
