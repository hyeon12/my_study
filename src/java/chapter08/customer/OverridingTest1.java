package chapter08.customer;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerlee = new Customer(10010, "이순신");
        customerlee.bonusPoint = 1000;

        VIPCustomer customerkim = new VIPCustomer(10020, "김유신", 12345);
        customerkim.bonusRatio = 10000;

        int price = 10000;
        System.out.println(customerlee.getCustomerName() + "님의 결제예상금액은 " + customerlee.calcPrice(price) + "원입니다.");
        System.out.println(customerkim.getCustomerName() + "님의 결제예상금액은 " + customerkim.calcPrice(price) + "원입니다.");
    }
}
