package innerclass;

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
        OutClass.InClass.sTest();

        OutClass.InClass inClass = outClass.new InClass();
        //OutClass 먼저 생성한 후에 인스턴스 내부 클래스 생성 가능
        inClass.inTest();
    }
}
