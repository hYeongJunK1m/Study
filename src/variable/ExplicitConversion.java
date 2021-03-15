package variable;

public class ExplicitConversion {
    public static void main(String[] args) {
        
        int i = 1000;
        byte bNum = (byte)i; //(byte)를 넣어줌으로 명시적 형변환을 넣어준다. 단, 데이터의 유실이 발생할 수 있음
        System.out.println(bNum);

        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum1+(int)fNum; // 형 변환이 된 상태로 + 가 됐기 때문에 1+0 = 1이라는 식과 계산이 나온다.
        int iNum2 = (int)(dNum1+fNum); //1.2 + 0.9 = 2.1 계산 후 형변환이 이루어지기 때문에 2가 된다.

        System.out.println(iNum1);
        System.out.println(iNum2);
        }


}

