package java_lesson_hw_6.cards;

public class CreditCard {
    /*Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.*/
    public String accountNumber;
    public double accountValue;

    public void addMoneyToCreditCard(double money){
        accountValue+= money;
        System.out.println("You have successfully added " +money +" to credit card!");
        System.out.println("Your current card balance after top up: "+accountValue);
    }

    public void getMoneyFromCreditCard(double money){
        if(accountValue>=money){
            accountValue-=money;
            System.out.println("You have withdrawn: "+money);
            System.out.println("Your current card balance after withdrawing: "+accountValue);
        }else {
            System.out.println("You don't have enough money to withdraw: "+money);
            System.out.println("Your current account balance: "+accountValue);
        }
    }

    public void getAccountInformation(){
        System.out.println("Your Card Account Number: "+accountNumber);
        System.out.println("Your Current Account Value: "+ accountValue);
    }

}

