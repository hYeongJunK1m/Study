package ifexample;

import java.util.Scanner;

public class IfExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //System.out은 출력 int은 입력

        int age = scanner.nextInt();
        int charge = 0;
        
        //성별일 땐 나눠서
        if (age < 8) {
            charge = 1000;
            System.out.println("잼민이");
        }
        else if (age<20){
            charge = 1500;
            System.out.println("급식");
        }
        else{
            charge = 2000;
            System.out.println("성인");
        }
        System.out.println("나이 :" + age);
        System.out.println("요금 :" + charge);
    }
}
