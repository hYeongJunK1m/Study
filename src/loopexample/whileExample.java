package loopexample;

public class whileExample {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;


        while( num <= 10 ) { //while(true)를 적을 경우 무한 루프
            sum += num++;

        }
        System.out.println(sum);
        System.out.println(num);



    }
}
