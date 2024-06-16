package string;

public class StringTest {
    public static void main(String[] args) {
        String str = new String("java");
        String str2 = new String("test");

        str = str.concat(str2);
        System.out.println(str);
    }
}
