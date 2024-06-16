package innerclass;

public class InnerTest3 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        //(함수) 지역 내부 클래스
        //직접 객체생성 x -> 메서드 호출을 통해 생성된 객체를 반환 받는 것!
        runner.run();
    }
}
