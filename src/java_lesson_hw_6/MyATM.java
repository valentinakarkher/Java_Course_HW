package java_lesson_hw_6;

public class MyATM {
    public static void main(String[] args) {
        createATM();


    }

    public static void createATM(){
        ATM myATM = new ATM(200,500,1000);
        myATM.addMoneyToMyATM();
        //myATM.withDrawMoney(90);//я протестировала и почему то не выводит результат если числа 60 70 80 90
       // myATM.ATMNotesAmount(0,0,0); почему не выводится : return "ATM machine current notes amount: "
        //                +"\t\n20 eur notes: "+noteTwn
        //                +"\t\n50 eur notes: "+noteFif
        //                + "\t\n100 eur notes: "+noteHun; ?

    }

}
