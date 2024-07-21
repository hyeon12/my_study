package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseable obj = new AutoCloseObj();
        try(obj){
            //throw new Exception();
        }catch (Exception e){
            System.out.println("예외 부분입니다.");
        }

//        try(AutoCloseable obj = new AutoCloseObj()){
//            throw new Exception();
//        }catch (Exception e){
//            System.out.println("예외 부분입니다.");
//        }
    }
}
