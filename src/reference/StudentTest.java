package reference;

public class StudentTest {

    public static void main(String[] args) {

        Students studentsLee = new Students(100, "LEE");
        studentsLee.setKoreaSubject("국어", 100);
        studentsLee.setMathSubject("수학", 95);

        Students studentsKim = new Students(100, "LEE");
        studentsKim.setKoreaSubject("국어", 95);
        studentsKim.setMathSubject("수학", 100);


    }
}
