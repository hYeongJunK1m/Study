package loopexample;

public class DoWhileExample {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0; //=0 은 초기화를 해주는 것 안하면 오류

        do{
            sum += num++;

        }while ( num<=10);
        System.out.println(sum);
        System.out.println(num);



    }
}
