package scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("VIP 고객의 전화를 먼저 받습니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 skill 값이 높은 상담원에게 우선 배분합니다.");
    }
}
