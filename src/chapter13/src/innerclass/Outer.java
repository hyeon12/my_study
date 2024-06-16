package innerclass;

public class Outer {
    int outNum = 100;
    static int sNum = 200;

//    void getNum(){ 상수로 처리되나, 지역 외부에선 사용 불가!?
//        System.out.println(localNum);
//    }

    Runnable getRunnable(int i){
        int num = 100;

        class myRunnable implements Runnable{
            int localNum = 10; //지역 내부 클래스에서 사용하는 지역변수 -> 상수로 처리됨

            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);
                System.out.println("outNum = " + outNum);
                System.out.println("Outer.sNum = " + Outer.sNum);
            }
        }
        return new myRunnable();
    }
}
