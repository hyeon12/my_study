package template;

public class AICar extends Car{
    @Override
    public void stop() {
        System.out.println("스스로 정지하기");
    }

    @Override
    public void drive() {
        System.out.println("자율 주행하기");
    }

    @Override
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 자동으로 조절합니다.");
    }
}
