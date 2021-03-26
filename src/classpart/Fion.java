package classpart;

public class Fion {

    public static int adNum(int num1, int num2){
        int result;
        result = num1+num2;
        return result;
    }
    public static void hello(String high){
        System.out.println(high);
    }
    public static int cSum(){

        int sume = 0;
        int y;
                for( y=0; y<=100; y++) {
                    sume += y;
        }
                return sume;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = adNum(n1, n2);

        hello("안녕");
        int num = cSum();

        System.out.println(total);
        System.out.println(num);

    }
}
