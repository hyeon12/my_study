package scheduler;


import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 방식을 선택하세요.");
        System.out.println("R : 한명씩 차례대로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : VIP 고객 먼저 할당");
        System.out.println("A : 상담원이 직접 가지고 오기");
        System.out.println("필요한 기능 입력 : ");

        int ch = System.in.read(); //문자를 입력받는 경우 IOException 로 예외처리 해야함!
        Scheduler scheduler = null;

        //입력받은 값에 따라 생성되는 클래스가 결정되는 조건식
        //클래스에서 생성한 인스턴스가 scheduler에 대입되고,
        //scheduler의 자료형은 Scheduler -> 해당 인터페이스를 구현한 클래스 모두 가능(다형성)
        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else if (ch == 'A' || ch == 'a'){
            scheduler = new AgentGetCall();
        } else {
            System.err.println("지원되지 않는 기능입니다.");
            return;
        }

        //생성된 인스턴스에 따라 각 클래스에 구현된 메서드가 호출됨!
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
        scheduler.showScheduler();
        //애노테이션을 쓰지 않아도.. 재정의는 가능하지만, 코드의 안전성/가독성을 위해 사용하는것
    }
}
