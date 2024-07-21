package chapter08.polymorphism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer(10010, "이순신");
        lee.bonusPoint = 1000;
        System.out.println(lee.showCustomerInfo());
        //Customer의 showinfo 메서드 출력

        Customer kim = new VIPCustomer(10020, "김유신", 12345);
        kim.bonusPoint = 1000;
        System.out.println(kim.showCustomerInfo());
        //VIP 인스턴스의 showinfo 메서드 출력

        Customer park = new GoldCustomer(10030, "박골드");
        park.bonusPoint = 1000;
        System.out.println(park.showCustomerInfo());

        System.out.println("====할인율과 보너스 포인트 계산====");

        int price = 10000;
        int leePrice = lee.calcPrice(price);
        int kimPrice = kim.calcPrice(price);
        int parkPrice = park.calcPrice(price);

        System.out.println(lee.customerName + "님 : " + leePrice + "원");
        System.out.println(kim.customerName + "님 : " + kimPrice + "원");
        System.out.println(park.customerName + "님 : " + parkPrice + "원");
    }
}
