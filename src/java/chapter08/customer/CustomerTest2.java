package chapter08.customer;

public class CustomerTest2 {
    public static void main(String[] args) {
        VIPCustomer customerkim = new VIPCustomer(10020, "김유신", 1004);
//        customerkim.setCustomerID(10020);
//        customerkim.setCustomerName("김유신");
//        customerkim.bonusPoint = 10000;
        System.out.println(customerkim.showCustomerInfo());
    }
}
