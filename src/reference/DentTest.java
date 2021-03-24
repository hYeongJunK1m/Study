package reference;

public class DentTest {
    public static void main(String[] args) {

        Dent dentLee = new Dent(100, "Lee");
        dentLee.setKoreaSubject("국어", 100);
        dentLee.setMathSubject("수학", 95);


        Dent dentKim = new Dent(100, "Kim");
        dentKim.setKoreaSubject("국어", 95);
        dentKim.setMathSubject("수학", 90);

        dentLee.showDentScore();
        dentKim.showDentScore();

    }
}