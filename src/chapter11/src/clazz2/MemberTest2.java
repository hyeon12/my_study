package chapter11.src.clazz2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MemberTest2 {
    public static void main(String[] args) throws Exception {
        Class clazz = Member.class;
        Constructor constructor = clazz.getDeclaredConstructors()[0];
        Object obj = constructor.newInstance();

        Field field = clazz.getDeclaredField("str");
        field.setAccessible(true);//값을 접근할 수 있게 바꿔주는 것

        field.set(obj, "DEF");

        System.out.println(obj);
    }
}
