package variable;

public class IntegerTest {
    public static void main(String[] args) {

        byte bs = 127; // byte는 -128 ~ 127까지 표현 가능
        System.out.println(bs);

        //int iVal = 12345678900;
        long lVal = 12345678900L; // long은 숫자 뒤에 L을 사용하여 사용한다. (4byte가 넘어가는 숫자)
        System.out.println(lVal);
    }
}
