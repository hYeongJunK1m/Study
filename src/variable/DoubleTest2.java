package variable;

public class DoubleTest2 {
    public static void main(String[] args) {
        double dNum = 1;

        for(int i = 0; i<10000; i++){
            dNum = dNum+0.1;
            // System.out.println(dNum); for문 안에 넣으면 모든 값을 다 출력
        }
        System.out.println(dNum); //조건문이 끝난 결과만 출력
    }
}
