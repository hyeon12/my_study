package scheduler;

public class AgentGetCall implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담원이 다음 전화 요청");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담원이 전화 상담을 가져갔습니다.");
    }

    public void showScheduler() {
        System.out.println("디폴트 재정의 없이 쓸거야!");
    }
}
