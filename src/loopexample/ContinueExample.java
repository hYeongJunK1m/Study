package loopexample;

public class ContinueExample {
    public static void main(String[] args) {

        int num;

        for (num = 1; num <= 100; num++) {

            if (num % 3 != 0) continue; // 앞 조건이 맞으면 출력을 실행하지 않고 for로 올라간다
                System.out.println(num);
            }
        }
    }

