package studenttest;

import student.Student;

public class StudentTest extends Student{
    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        st.setName("Banh");
        st.setClassname("C11");
        System.out.println(st.getName() + st.getClassname());



//        Student s = new Student();
//        s.setName("Khanh");
//        s.setClassname("C09");
//        System.out.println(s.getName() + s.getClassname());
    }
}
