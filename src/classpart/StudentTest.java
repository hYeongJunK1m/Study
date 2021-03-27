package classpart;

import classpart.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "정형일";
        studentLee.address = "교도소";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "김준서";
        studentKim.address = "소년원";


        studentKim.showStudentInfo();
    }

}