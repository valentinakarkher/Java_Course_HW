package java_lesson_hw_6;

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

   /* public String ATMNotesAmount (int noteTwn, int noteFif, int noteHun){
        noteTwn=noteTwenty;
        noteFif=noteFifty;
        noteHun=noteHundred;
        return "ATM machine current notes amount: "
                +"\t\n20 eur notes: "+noteTwn
                +"\t\n50 eur notes: "+noteFif
                + "\t\n100 eur notes: "+noteHun;

    }не понимаю почему не работает этот метод помогите пожалуйста*/



    public void addMoneyToMyATM(){
        System.out.println("Please enter PIN-code :");
        int pinCode= getInput().nextInt();
        System.out.println("Please enter amount of money you want to add :");
        int amountAddingMoney= getInput().nextInt();
        if (amountAddingMoney%10!=0&&amountAddingMoney<20){//здесь явно чтото не так с условием но я не понимаю что
            System.out.println("ATM machine can accept only 20, 50, 100 eur notes! Please change the amount!");
            return;
        }
        System.out.println("Please put "+amountAddingMoney+" EUR to ATM machine!");
        int addedHundrNotes = amountAddingMoney/100;
        amountAddingMoney-=addedHundrNotes*100;
        int addedFifNotes= amountAddingMoney/50;
        amountAddingMoney-=addedFifNotes*50;
        int addedTwnNotes = amountAddingMoney/20;
        amountAddingMoney-=addedTwnNotes*20;
        if(amountAddingMoney==0){
            noteHundred+=addedHundrNotes;
            noteFifty+=addedFifNotes;
            noteTwenty+=addedTwnNotes;
            System.out.println("You have successfully topped up your balance!");
            System.out.println("Good bye! Have a nice day!");

        }




    }
public boolean withDrawMoney(int moneySum){
    if (moneySum%20!=0&&moneySum%50!=0&&moneySum%100!=0){ //здесь явно чтото не так с условием но я не понимаю что
        System.out.println("ATM machine has only 20, 50, 100 eur banknotes! ");
        System.out.println("Please change amount you want to withdraw!");
        return false;

    }
    int needHundr =Math.min(moneySum/100,noteHundred);
    moneySum-=needHundr*100; //по хорошему здесь нужна проверка не превышает ли запрашиваемая сумма количество всех денег в банкомате но у меня и так голова разболелась, простите пожалуйста
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
