public class BreakContinueTest {
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
