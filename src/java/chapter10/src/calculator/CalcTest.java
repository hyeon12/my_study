package calculator;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 0;

        CompleteCalculator calculator = new CompleteCalculator();
        System.out.println(calculator.add(num1 ,num2));
        System.out.println(calculator.substract(num1 ,num2));
        System.out.println(calculator.times(num1 ,num2));
        System.out.println(calculator.divide(num1 ,num2));
        //에러 출력
        System.out.println(calculator.divide(num1 ,num3));
        //나혼자코딩 예제 출력
        System.out.println(calculator.square(num2));
        System.out.println(calculator.square(num3));
        calculator.showInfo();

        System.out.println();
        System.out.println("======Calc 자료형======");
        Calc calc = new CompleteCalculator();
        System.out.println(calc.add(num1, num2));
        //calc.showInfo(); 하위 클래스에서 정의한 메서드라 사용불가
        //사용하려면 다운캐스팅이 필요하다
        Calc calc2 = new CompleteCalculator();
        CompleteCalculator comcal = (CompleteCalculator)calc2;
        comcal.showInfo(); //다운캐스팅해서 사용!

        System.out.println();
        System.out.println("======정적 메서드 사용======");
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));

        calc.description();


    }
}
