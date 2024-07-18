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


/*
* Customer vip = new VIPCustomer();로 생성된 인스턴스 VIPCustomer는 Customer형이라서,
Customer형으로 형 변환(업캐스팅) 된 경우에는 Customer 클래스에서 선언한 변수/메서드만 사용 가능합니다.

VIPCustomer에서 선언한 getAgentID() 는 사용 불가고요!
그래서 하위 클래스에서 선언한 메서드를 쓰고 싶은 경우에는
VIPCustomer vc = (VIPCustomer) vip; 와 같이
상위 클래스(Customer)로 형 변환되었던 하위 클래스를 원래 자료형(VIPCustomer)으로 돌려서 getAgentID()를 쓴 거였답니다...!

*/