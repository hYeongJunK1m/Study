package variable;

public class ImplicitConversion {
    public static void main(String[] args) {

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2; //int와 float은 같은 4btye이지만 실수가 더 정밀한 숫자, 모든 정수가 실수로 형변환 시 문제없음

        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum; //실수와 정수의 형변환은 실수로 바뀐다.

        System.out.println(dNum);
    }
}
