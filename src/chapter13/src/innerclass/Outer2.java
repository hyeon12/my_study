package innerclass;

public class Outer2 {
    Runnable getRunnable(int i){
        int num = 100;

        return  new Runnable() {//익명 내부 클래스 Runnable 인터페이스 생성
            @Override
            public void run() {
                //num = 200;
                //i = 10;
                System.out.println("getRunnable 지역 내부 익명 클래스");
                System.out.println(i);
                System.out.println(num);
            }
        };
        //클래스 끝 ;


    }

    Runnable runner = new Runnable() {//익명 내부 클래스를 변수에 대입
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };
}
