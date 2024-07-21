package calculator;

import org.w3c.dom.ls.LSOutput;

public class CompleteCalculator extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0){
            return num1/num2;
        }else{
            System.out.println("나누는 숫자는 0이 될 수 없습니다.");
            return Calc.ERROR;
        }
    }

    @Override
    public int square(int num) {
        return num*num;
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스 구현 -> Calculator 추상클래스 -> 상속");
    }
}
