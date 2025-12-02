package java_lesson_hw_13;

import java.util.Date;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
    }
    @Override
    public String getMessage(){
        return "WrongPasswordException"+ new Date();
    }

}
