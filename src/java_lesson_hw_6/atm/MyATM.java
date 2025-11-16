package java_lesson_hw_6.atm;

public class MyATM {
    public static void main(String[] args) {
        createATM();



    }

    public static void createATM(){
        ATM myATM = new ATM(200,500,1000);
        myATM.ATMNotesAmount();
        System.out.println(myATM.ATMNotesAmount());

        myATM.addMoneyToMyATM();

        myATM.withDrawMoney(100);
        System.out.println(myATM.ATMNotesAmount());

    }

}
