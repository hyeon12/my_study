package chapter08.customer;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030, "나몰라", 12345);
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + "님의 결제 예상 금액은 " + vc.calcPrice(10000) + "원입니다.");
        //인스턴스의 메서드가 호출되는 기술 = 가상 메서드
        //상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재하는 경우, 호출되는 메서드는 "인스턴스"에 따라 결정된다!
        //VIPCustomer 의 메서드가 호출된 이유~~!
    }
}
