package innerclass;

public class OutClass2 {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            //num += 20; 외부 클래스의 인스턴스 변수 사용 불가
            System.out.println("외부 클래스의 정적 변수 : " + sNum);
            System.out.println("내부 클래스의 정적 변수 : " + sInNum);
            System.out.println("내부 클래스의 인스턴스 변수 : " + inNum);
        }

        static void sTest(){
            System.out.println("외부 클래스의 정적 변수 : " + sNum);
            System.out.println("내부 클래스의 정적 변수 : " + sInNum);
            System.out.println("정적 내부 클래스의 정적 메서드");
        }
    }
}
