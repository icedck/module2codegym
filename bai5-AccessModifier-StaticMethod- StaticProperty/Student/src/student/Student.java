package student;

public class Student {
    private String name = "John";
    private String classname = "C02";

    public Student() {

    }

    protected String getName() {
        return name;
    }

    protected String getClassname() {
        return classname;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClassname(String classname) {
        this.classname = classname;
    }


}
