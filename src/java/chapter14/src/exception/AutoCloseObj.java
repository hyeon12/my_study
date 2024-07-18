package exception;

public class AutoCloseObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("리소스 close() 되었습니다.");
    }
}
