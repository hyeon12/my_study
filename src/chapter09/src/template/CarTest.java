package template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("-----자율 주행하는 자동차-----");
        Car auto = new AICar();
        auto.run();
        System.out.println("-----수동 주행하는 자동차-----");
        Car self = new ManualCar();
        self.run();
        //run() - 템플릿 메서드
        //실행 순서, 시나리오를 정의한 메서드로, final 예약어 사용하여 재정의 x
    }
}
