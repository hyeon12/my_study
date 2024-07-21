package innerclass;

public class InnerTest2 {
    public static void main(String[] args) {
        OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
        //정적 내부 클래스 -> 외부 클래스 생성하지 않고도, 바로 선언하여 생성 가능
        System.out.println("정적 내부 클래스의 인스턴스 메서드");
        sInClass.inTest();
        System.out.println("정적 내부 클래스의 정적 메서드");
        OutClass2.InStaticClass.sTest();
    }
}
