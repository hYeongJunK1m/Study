package reference;

public class Dent {

    int dentID;
    String dentName;

    Subject korea;
    Subject math;

    public Dent(int id, String name){

        dentID = id;
        dentName = name;

        korea = new Subject();
        math = new Subject();
    }
    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }
    public  void showDentScore(){
        int total = korea.score + math.score;
        System.out.println(dentName + "학생의 총점은 " + total + "입니다.");
    }
}
