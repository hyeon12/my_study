package lambda;

@FunctionalInterface
//함수형 인터페이스임을 명시적으로 표현 -> 메서드 두 개 이상 선언시 오류 발생
public interface MyNumber {
    //함수형 인터페이스
    int getMax(int num1, int num2);
}
