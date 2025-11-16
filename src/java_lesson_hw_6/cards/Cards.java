package java_lesson_hw_6.cards;

public class Cards {

    public static void main(String[] args){
        createCreditCard();
    }
    public static void createCreditCard(){
        CreditCard mir = new CreditCard();


        mir.accountNumber= "0345543167984675";
        mir.accountValue=5000.0;

        mir.getAccountInformation();
        mir.addMoneyToCreditCard(3500);
        mir.getMoneyFromCreditCard(1559);

        CreditCard maestro = new CreditCard();
        maestro.accountNumber="4321456789066775";
        maestro.accountValue=67843.0;

        System.out.println();
        maestro.getAccountInformation();
        maestro.addMoneyToCreditCard(807);
        System.out.println();

        CreditCard visa = new CreditCard();
        visa.accountNumber="6600789054325688";
        visa.accountValue=86543;

        visa.getAccountInformation();
        visa.getMoneyFromCreditCard(6000);
        visa.getAccountInformation();



    }
}
