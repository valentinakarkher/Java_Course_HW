package java_lesson_hw_13;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    /* Задача 1:
Создать класс, в котором будет статический метод. Этот метод принимает на вход три
параметра: login, password, confirmPassword. Все поля имеют тип данных String.

  Длина login должна быть меньше 20 символов и не должен содержать пробелы.
  Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.

  Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен
содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.

Если password не соответствует этим требованиям, необходимо выбросить
WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны, false в противном случае.
Задача *:
Написать try/catch/finally, в котором finally вызван не будет.
*/
    public static void main(String[] args) {
        System.out.println(checkUserData("qwerty2", "qwertyuiopqwertyu2", "qwertyuiopqwertyu2"));
    }
    public static boolean checkUserData(String login, String password, String confirmPassword){
        try{
            checkUserLogin(login);
            checkUserPassword(password,confirmPassword);
        }catch (WrongLoginException loginException){
            System.out.println(loginException.getMessage());
            return false;
        }catch (WrongPasswordException passwordException){
            System.out.println(passwordException.getMessage());
            return false;
        }return true;
    }

    public static void checkUserLogin(String login) throws WrongLoginException {
        if(!login.contains(" ")){}else throw new WrongLoginException();
        if(login.length()<20){}else throw new WrongLoginException();
        if(login.equals("qwerty23")){ System.out.println("Your Login is correct!");
        }else throw new WrongLoginException();
    }
    public static void checkUserPassword(String password, String confirmPassword)throws WrongPasswordException{
        Pattern passwordPattern = Pattern.compile("^(?=.*\\d+)\\S{8,19}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        if(passwordMatcher.matches()){}else {
            System.out.println("WRONG PASSWORD\nPassword should contain from 8 to 20 symbols\n A-z characters with at least one digit 0-9! ");
            throw new WrongPasswordException();
        }
        if(password.equals(confirmPassword)){ System.out.println("Your password is correct!");}
        else {
            System.out.println("Password doesn't match");
            throw new WrongPasswordException();
        }
    }


}
