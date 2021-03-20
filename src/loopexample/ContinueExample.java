package loopexample;

public class ContinueExample {
    public static void main(String[] args) {

        int num;

        for (num = 1; num <= 100; num++) {

            if (num % 3 != 0) continue; // 앞 조건이 맞으면 출력을 실행하지 않고 for로 올라간다
                System.out.println(num);
            }
        }

    public static class BreakContinueTest {
        public static void main(String[] args) {

            int dan = 2;
            int con = 1;
            int num;

                for ( dan = 2; dan <=9; dan++ ){

                    if( dan % 2 !=0  ) continue;
                    for(con = 1; con<=9; con++) {

                        System.out.println(dan + "X" + con + "=" + dan * con);
                        if(con >= dan) break;
                    }
                    System.out.println();
                }

        }
    }
}

