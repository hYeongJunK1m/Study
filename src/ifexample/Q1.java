package ifexample;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long won = scanner.nextInt();


        long wonL;
        String grade;

        if (won >= 150000) {
            grade = "MVP";
        } else if (won >= 100000) {
            grade = "VVIP";
        } else if (won >= 50000) {
            grade = "VIP";
        } else if (won > 50000) {
            grade = "G";
        } else {
            grade = "O";
        }
        System.out.println(grade);
    }
}