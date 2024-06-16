package lambda;

public class StringConcatIpl implements StringConcat{
    @Override
    public void makeString(String n1, String n2) {
        System.out.println(n1 + "," + n2);
    }
}
