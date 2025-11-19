package java_lesson_hw_10;

import java_lesson_hw_9.figures.Clonable;

import java.util.Scanner;

public class User implements Clonable{
    /*Задача 1:
    Создать класс для описания пользователя системы. Переопределить в классе методы
    toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
    значением полей и сравнить с помощью метода equals.
    Задача *:
    Создать программу для реализации поверхностного и глубокого клонирования объекта
    класса User. Пусть на вход программе будет передаваться тип операции клонирования
            (поверхностное клонирование или глубокое), а также id юзера для клонирования.*/
    private String userName;
    private String userId;
    private UserLogInValue userValue;

    public User(String userName, String userId){
        this.userName= userName;
        this.userId= userId;
    }
    public User(String userName, String userId,UserLogInValue userValue){
        this.userName= userName;
        this.userId= userId;
        this.userValue=userValue;
    }

    public UserLogInValue getUserValue() {
        return userValue;
    }

    public void setUserValue(UserLogInValue userValue) {
        this.userValue = userValue;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString(){
        return "User Name is : "+userName+"\n"
                +"User ID is : "+userId;
    }
    @Override
    public int hashCode(){
        return 2*(userName.hashCode()+userId.hashCode());

    }
    @Override
    public boolean equals(Object object){
        if (this==object)return true;
        else if (object== null) return false;
        User user = (User) object;
       return this.userName==user.userName&&this.userId==user.userId;

    }

    public Scanner getInput(){
        return new Scanner(System.in);
    }

    @Override
    public User clone()throws CloneNotSupportedException{
        return (User) super.clone();
    }



    public User cloneUserComplicatedMethod(String typeCloning, User user) throws CloneNotSupportedException{
        User clonnedUser = user.clone();
        if (typeCloning=="shallow") {
            System.out.println("Your Cloned User Information: ");
            System.out.println("\tUser Name: "+clonnedUser.getUserName()+"\n"
                               +"\tUser ID: " +clonnedUser.getUserId());
            return clonnedUser;
        } else if (typeCloning=="deep") {

            UserLogInValue cloneUserValue = this.getUserValue().clone();
            clonnedUser.setUserValue(cloneUserValue);
            System.out.println("Your Cloned User Information: ");
            System.out.println("\tUser Name: "+clonnedUser.getUserName()+"\n"
                    +"\tUser ID: " +clonnedUser.getUserId() +"\n"
                    +"\tUserLoginValue : "+clonnedUser.getUserValue());

        }return clonnedUser;

    }
}
