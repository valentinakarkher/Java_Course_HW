package java_lesson_hw_6.atm;

import java.util.Scanner;

public class ATM {
    /*
Задача *:
Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.

1)Сделать метод для добавления денег в банкомат.

2)Сделать функцию, снимающую деньги, которая
принимает сумму денег, а 4) возвращает булевое значение - успешность выполнения
операции. 3) При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма.

Создать конструктор с тремя параметрами -
количеством купюр каждого номинала.*/

   public int noteTwenty;
    public int noteFifty;
    public int noteHundred;

    public ATM (int noteTwm, int noteFif, int noteHun){
        noteTwenty=noteTwm;
        noteFifty=noteFif;
        noteHundred=noteHun;
    }

   public String ATMNotesAmount(){

        return "ATM machine current notes amount: "
                +"\t\n20 eur notes: "+noteTwenty
                +"\t\n50 eur notes: "+noteFifty
                + "\t\n100 eur notes: "+noteHundred;

    }



   public void addMoneyToMyATM(){
        System.out.println("Please enter PIN-code :");
        int pinCode= getInput().nextInt();
        System.out.println("Please enter amount of money you want to add :");
        int amountAddingMoney= getInput().nextInt();
        if (amountAddingMoney!=20&amountAddingMoney!=50&amountAddingMoney!=100){
            System.out.println("ATM machine can accept only 20, 50, 100 eur notes! Please change the amount!");
            return;
        }
        System.out.println("Please put "+amountAddingMoney+" EUR to ATM machine!");

        if(amountAddingMoney==20)
        {
            noteTwenty++;
            System.out.println("You have successfully added "+amountAddingMoney+" eur your balance!");
            System.out.println("Good bye! Have a nice day!");

        }else if(amountAddingMoney==50){
            noteFifty++;
            System.out.println("You have successfully added "+amountAddingMoney+" eur your balance!");
            System.out.println("Good bye! Have a nice day!");
        }else if(amountAddingMoney==100){

        noteHundred++;
            System.out.println("You have successfully added "+amountAddingMoney+" eur your balance!");
            System.out.println("Good bye! Have a nice day!");
    }





    }
public boolean withDrawMoney(int moneySum){
    if (moneySum!=20&moneySum!=50&moneySum!=100){
        System.out.println("ATM machine has only 20, 50, 100 eur banknotes! ");
        System.out.println("Please change amount you want to withdraw!");
        return false;

    }
    int needHundr =Math.min(moneySum/100,noteHundred);
    moneySum-=needHundr*100;
    int needFif=Math.min(moneySum/50,noteFifty);
    moneySum-=needFif*50;
    int needTwn=Math.min(moneySum/20,noteTwenty);
    moneySum-=needTwn*20;
    if(moneySum==0){
        noteHundred-=needHundr;
        noteFifty-=needFif;
        noteTwenty-=needTwn;

        System.out.println("You will receive : ");
        System.out.println("20 eur notes: "+needTwn);
        System.out.println("50 eur notes: "+needFif);
        System.out.println("100 eur notes: "+needHundr);

    } return true;}

    public static Scanner getInput (){
        return new Scanner (System.in);
    }

}
