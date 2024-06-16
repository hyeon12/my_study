package clazz;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalArgumentException {
        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("clazz.Person");

        //왜 오류가 생기는 걸까...
        //java: unreported exception java.lang.IllegalAccessException; must be caught or declared to be thrown
        //Person person2 = (Person)pClass.newInstance();
        //System.out.println(person2);

    }
}
