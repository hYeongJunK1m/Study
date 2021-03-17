package loopexample;

public class ForExample {
    public static void main(String[] args) {


        int count;

        int sum = 0; //어떤 값에 더해져야 할 떈 초기화를 해야한다.

        for (count = 0; count < 10; count++){ //횟수만 필요하다면 = 0 으로 주로함 + int i =0 을 주로 사용
            sum += count;
        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while(num<=10) {
            total += num;
            num++;
        }
        System.out.println(sum);
    }
}