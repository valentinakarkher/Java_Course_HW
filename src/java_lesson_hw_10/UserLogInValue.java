package java_lesson_hw_10;

import java_lesson_hw_9.figures.Clonable;

public class UserLogInValue implements Clonable {
    private int logInValue;

    public UserLogInValue(int logInValue){
        this.logInValue=logInValue;

    }

    public int getLogInValue() {
        return logInValue;
    }

    public void setLogInValue(int logInValue) {
        this.logInValue = logInValue;
    }

    @Override
    public UserLogInValue clone()throws CloneNotSupportedException{
        return (UserLogInValue) super.clone();
    }

}
