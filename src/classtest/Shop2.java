package classtest;

public class Shop2 {

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.number = 201907210001L;
        shop.id = "abc123";
        shop.date ="2019년 7월 21일";
        shop.name = "홍길순";
        shop.orderNumber = "PD0345-12";
        shop.home = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호 :" + shop.number);
        System.out.println("주문자 아이디 :" + shop.id);
        System.out.println("주문 날짜 :" + shop.date);
        System.out.println("주문자 이름 :" + shop.name);
        System.out.println("주문 상품 번호 :" + shop.orderNumber);
        System.out.println("배송 주소 :" + shop.home);


    }
}
