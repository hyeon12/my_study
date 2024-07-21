package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        System.out.println("java 문자열 주소 : " + System.identityHashCode(java));

        //문자열 추가하는 경우, StringBuilder 클래스 생성하고, 문자열 추가
        StringBuilder buffer = new StringBuilder(java);
        //String 으로부터 StringBuilder 생성 (문자열 안전하게 변경되도록 보장x)
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programing is fun!");
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        java = buffer.toString(); //연산(문자열 변경) 후에 String 클래스로 반환하여, 다시 문자열로 반환
        System.out.println(java);
        System.out.println("새로 만들어진 java 문자열 주소 : " + System.identityHashCode(java));
    }
}
