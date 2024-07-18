package configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBConn {
    private static SqlSessionFactory factory;
    //데이터베이스와 연동하는 SqlSessionFactory 인스턴스 생성(정적)
    /*
    SqlSessionFactory
    애플리케이션 실행 시 한 번 생성되며, 전역적으로 사용됨
    데이터베이스 설정 정보를 바탕으로 데이터베이스와의 연결을 설정하고,
    필요한 SQL 매핑 파일 및 설정 정보를 로드하여 SqlSession을 생성
    */

    /*
    SqlSession
    데이터베이스와의 실제 세션을 나타냄(*세션? 데이터베이스와의 실제 연결 상태)
    데이터베이스 트랙잭션을 관리하며 SQL 쿼리의 실행 및 결과를 반환!
    필요한 SQL 매핑 파일(XML이나 어노테이션)을 바탕으로
    데이터베이스 작업을 수행할 수 있는 메소드들을 제공
    */

    static{
        try{
            Reader reader = Resources.getResourceAsReader("configs/mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(reader);
            //설정 파일을 읽어와 SqlSessionFactory 객체를 생성
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static SqlSession getSession(boolean autoCommit){
        return factory.openSession(autoCommit);
        //SqlSessionFactory에서 SqlSession을 자동으로 설정하고,
        //자동 커밋 옵션을 설정
    }

    public static SqlSession getSession(){
        return getSession(true);
        //autoCommit:true -> 자동 커밋을 기본값으로 설정
    }
}
