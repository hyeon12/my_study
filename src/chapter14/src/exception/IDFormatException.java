package exception;

public class IDFormatException extends Exception{
    public IDFormatException(String message){
        super(message);//매개변수로 예외 상황 메세지를 받음
    }
}
