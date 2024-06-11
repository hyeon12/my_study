package chapter08.customer;

public class CustomerTest3 {
    public static void main(String[] args) {
        Customer vip = new VIPCustomer(1000, "김이름", 1000);
        System.out.println(vip.showCustomerInfo());
        //System.out.println(vip.getAgentID); - Customer형으로 형 변환되었으므로, VIPCustomer의 getAgentID() 사용 불가

        VIPCustomer vc = (VIPCustomer) vip;
        System.out.println(vc.showCustomerInfo());
        System.out.println(vc.getAgentID()); // VIPCustomer형으로 다운캐스팅 => getAgentID() 사용 가능
    }
}
