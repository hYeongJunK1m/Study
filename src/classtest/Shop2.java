package classtest;

public class Shop2 {

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.number = 202110190001L;
        shop.id = "HJK123";
        shop.date ="2021년 10월 19일";
        shop.name = "김땡";
        shop.orderNumber = "PD0345-12";
        shop.home = "경기도 00시 00동 000번지";

        System.out.println("주문 번호 :" + shop.number);
        System.out.println("주문자 아이디 :" + shop.id);
        System.out.println("주문 날짜 :" + shop.date);
        System.out.println("주문자 이름 :" + shop.name);
        System.out.println("주문 상품 번호 :" + shop.orderNumber);
        System.out.println("배송 주소 :" + shop.home);


    }
}
