package ifexample;

import java.util.Scanner;

public class IfExample3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rank = scanner.nextInt();

        String color;

        switch (rank){
            case 1: color ="Gold";
                break;
            case 2: color ="Silver";
                break;
            case 3: color ="Bronze";
                break;
            default: color ="C";

        }
        System.out.println(rank + "등 "+ color + " medal");
    }

}
