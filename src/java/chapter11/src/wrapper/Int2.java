package wrapper;

public class Int2 {
    public static void main(String[] args) {
        //변환 없이도 바로 사용 가능(컴파일러가 변환해주기 때문에!)
        Integer num1 = new Integer(100);
        int num2 = 200;
        int sum = num1 + num2; // num1 -> 컴파일러가 num1.intValue()로 int 자료형 변환해줌 => 언박싱
        System.out.println(sum);
        Integer sumInteger = sum; // sum.valueOf(sum) 로 Integer형으로 변환 => 오토박싱
    }
}
