package innerclass;

public class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass; //내부 클래스 자료형 변수를 먼저 선언

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int inNum = 100;
        //인스턴스 내부 클래스인데 정적 변수가 가능하다..?!
        static int sInNum = 1000;

        void inTest(){
            System.out.println("외부 클래스 num = " + num );
            System.out.println("외부 클래스 sNum = " + sNum);
        }

        //여기도 마찬가지....!!.. 왜지
        static void sTest(){
            System.out.println("static 메서드 sTest()");
        }
    }
    public void usingClass(){
        inClass.inTest();
    }
}
