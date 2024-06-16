package lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> {if(x>=y) return x; else return y;};
        //인터페이스형 변수 max 선언 후, 변수에 람다식 대입
        System.out.println(max.getMax(10, 20));
        //getMax 메서드 호출해서 매개변수 대입

        MyNumber max2 = (x, y) -> (x >= y) ? x : y ;
        System.out.println(max2.getMax(10, 5));
    }
}
