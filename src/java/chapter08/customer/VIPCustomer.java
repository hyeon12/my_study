package chapter08.customer;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //보너스 포인트 적립
        return price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환
    }

    public int getAgentID(){
        return agentID;
    }
}
