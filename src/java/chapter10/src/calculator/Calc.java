package calculator;

public interface Calc {
    //인터페이스에 선언한 변수는 컴파일 과정에서 상수가 된다!
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num);

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    static int total(int[] arr){
        //매개변수로 전달된 배열의 모든 요소 값을 더한다..!
        int total = 0;

        for(int i : arr){
            total += i;
        }

//        일반 for 문 연습~
//        for(int i = 0; i < arr.length; i++){
//            total += arr[i];
//        }
        myStaticMethod();
        return total;
    }

    private void myMethod(){
        System.out.println("private 메서드지롱");
    }

    private static void myStaticMethod(){
        System.out.println("private static 메서드지롱");
    }
}
