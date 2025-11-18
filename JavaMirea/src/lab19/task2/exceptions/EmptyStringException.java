package lab19.task2.exceptions;

public class EmptyStringException extends RuntimeException{
    public EmptyStringException(String message){
        super(message);
    }
}
