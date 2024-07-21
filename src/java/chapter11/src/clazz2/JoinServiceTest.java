package chapter11.src.clazz2;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class JoinServiceTest {
    public static void main(String[] args) throws Exception{
        Class clazz = JoinService.class;

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println("매개변수 갯수" + constructor.getParameterTypes().length);

            List<Object> arguments = new ArrayList<>();
            for(Class clz : constructor.getParameterTypes()){
                if(clz == String.class){// 문자열
                    arguments.add("문자열");
                }else if(clz == int.class){// 기본 자료형 int
                    arguments.add(100);
                }else if(clz == long.class){// 기본 자료형 long
                    arguments.add(200L);
                }
            }

            Object obj = arguments.isEmpty()?
                    constructor.newInstance() //매개변수가 없으면 없는 상태로 기본 생성자->생성
                    :
                    constructor.newInstance(arguments.toArray());
            //매개변수가 없으면 기본 생성자로 생성, 있으면 배열을 매개변수로 담아 생성

            //동적 생성
            JoinService service = (JoinService) obj;
            System.out.println(service);
        }
    }
}
