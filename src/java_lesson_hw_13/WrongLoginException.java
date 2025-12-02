package java_lesson_hw_13;

import java.util.Date;

public class WrongLoginException extends Exception{
    public WrongLoginException(){}
    public WrongLoginException(String message){}

    @Override
    public String getMessage(){
        return "WrongLoginException"+ new Date();
    }

}
