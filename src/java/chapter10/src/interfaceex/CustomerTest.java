package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyc = new Customer();
        buyc.order();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        if(seller instanceof Customer){//seller 인스턴스 자료형이 Customer라면,
            Customer customer2 = (Customer) seller; //인스턴스 seller를 Customer형으로 다운 캐스팅
            customer2.buy();
            customer2.sell();
            customer2.order();
        }

        //가상메서드원리로 Customer 에 재정의한 디폴트 메서드가 호출된다
        //
    }
}
