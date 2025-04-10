public class Student {
    String id;
    String name;
    float age;
    String email;
    float Grade;

    public Student(String id, String name, float age, String email, float grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        Grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public float getGrade() {
        return Grade;
    }
}
