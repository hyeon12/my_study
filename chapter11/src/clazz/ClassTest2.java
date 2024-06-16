package clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassTest2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class classex = Person.class;

        Constructor[] cons = classex.getConstructors();
        for(Constructor c : cons){
            System.out.println("생성자 : " + c);
        }

        System.out.println();
        Field[] fields = classex.getFields();
        for(Field f : fields){
            System.out.println("멤버변수(필드) : " + f);
        }

        //왜 필드(멤버변수)출력 안되는걸까..?
        //아직 인스턴스화 하지 않은 상태면 ... 필드명도 알 수 없는걸까? ㅜㅜ
        System.out.println();
        Field[] fields2 = classex.getFields();
        for(Field f : fields2) {
            System.out.println(fields2);
            System.out.println(f.getName());
        }

        //멤버변수가 private 이나 protected로 정의된 경우에는
        //getDeclaredFields()로 가지고 오면 된다!!
        System.out.println();
        Field[] fields3 = classex.getDeclaredFields();
        for(Field f : fields3) {
            System.out.println(fields3);
            System.out.println(f.getName());
        }

        System.out.println();
        Method[] methods = classex.getMethods();
        for(Method m : methods){
            System.out.println("메서드 : " + m);
        }
    }
}
