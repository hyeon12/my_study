package chapter08.polymorphism;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.2;
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //보너스 포인트 적립
        return price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
    }

    public int getAgentID(){
        return agentID;
    }
}
