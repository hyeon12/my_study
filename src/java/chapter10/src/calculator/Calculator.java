package calculator;

public abstract class Calculator implements Calc{
    //모든 메서드를 구현한 상태가 아니므로,
    //구현한 메서드 + 추상 메서드 => 추상클래스로 바꿔줘야 오류x
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }
}
