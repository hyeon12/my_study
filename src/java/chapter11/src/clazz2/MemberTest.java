package chapter11.src.clazz2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class MemberTest {
    public static void main(String[] args) throws Exception{
        Class clazz = Member.class;

        //메서드 호출을 위해 필요한 객체 생성
        Constructor constructor = clazz.getDeclaredConstructors()[0];
        Object obj = constructor.newInstance();

        //객체의 메서드 목록 getDeclaredMethods() - 배열형태
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){//methods[] 각 배열의 요소를 method 에 담음
            String name = method.getName();
            if(!name.startsWith("set")){
                //setter 메서드만 호출
                continue;
            }
            //setter 메서드만 넘어옴
            //매개 변수 유형을 선언 순서대로 나타내기
            //SETTER 메서드의 매개변수를 반환하는 거라서 [0]만 반환하는것임
            Class clz = method.getParameterTypes()[0];
            //System.out.println(clz);
            Object arg = null;
            if(clz == String.class){
                //setter 메서드의 매개변수가 문자열
                arg = "문자열";
            }else if(clz == LocalDateTime.class){
                //setter 메서드의 매개변수가 LocalDateTime
                arg = LocalDateTime.now();
            }

            method.invoke(obj, arg); //setter 메서드 호출
        }
        System.out.println(obj);
    }
}
