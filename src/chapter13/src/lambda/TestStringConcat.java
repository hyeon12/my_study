package lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "java";
        String s3 = "world";
        StringConcatIpl concatIpl = new StringConcatIpl();
        concatIpl.makeString(s1, s2);
        concatIpl.makeString(s2, s3);

        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("안녕", "자바");

        StringConcat concat2 = (x, y) -> System.out.println(x.concat(y));
        concat2.makeString("abc", "def");

        StringConcat concat3 = new StringConcat(){
            @Override
            public void makeString(String n1, String n2) {
                System.out.println(s1 + "," + s2);
            }
        };
    }
}
