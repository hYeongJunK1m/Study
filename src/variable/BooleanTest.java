package variable;

public class BooleanTest {
    public static void main(String[] args) {

        boolean student = false;
        System.out.println(student);

        var i = 10.0;
        System.out.println(i);
            /* var 변수의 문제점
            1.정의되어진 변수가 함수의 스코프를 사용한다.
            2.var키워드를 사용하지 않고 변수를 할당하게 되어지면 "전역변수"의 역할로써 사용이 되어지게 된다.
            3.var의 경우 함수 scope이기 때문에 for문에서 정의된 변수가 반복문이 끝난이후에도 남아있는 현상이 생긴다.

             */
    }
}
