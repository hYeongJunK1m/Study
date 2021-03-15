package variable;

import java.sql.SQLOutput;

public class CharTest {
    public static void main(String[] args) {

        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch); //ch는 내부적으로 65라는 값으로 저장되어있다.

        int iCh = 66;
        System.out.println((char) iCh); // ich는 내부정으로 B 정수 값을 가지고 있다.

        //char ch2 = -66; 처럼 음수 값은 안된다.

        char hangul = '\uAC00'; //유니코드
        System.out.println(hangul);

    }
}
