package java_lesson_hw_7.hospital;

public class Dentist extends Doctor {
    public Dentist (String myProfession, String myMedPlan) {
        super(myProfession, myMedPlan);
    }
    @Override
    public void setMedPlan(String myDentistMedPlan) {
        myDentistMedPlan="Please do brush your teeth and don't eat sugar!!";
    }

    @Override
    public String getMyMedPlan() {
        return "Please brush your teeth and don't eat sugar!!";
    }

    @Override
    public void curingMethod(String neededPatientPlan){
        System.out.println("Your disease code is: "+ neededPatientPlan);
        System.out.println("Your treatment prescription: "+getMyMedPlan());
    }
}
