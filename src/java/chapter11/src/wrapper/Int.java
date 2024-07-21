package wrapper;

public class Int {
    public static void main(String[] args) {
        //과거에는 intValue()로 값을 꺼내야했음 (자바5버전)
        Integer iValue = new Integer(100);
        System.out.println(iValue);
        int myValue = iValue.intValue();
        System.out.println(myValue);
    }
}
