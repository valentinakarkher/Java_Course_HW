package java_lesson_hw_7.hospital;

public class Surgeon extends Doctor {
    public Surgeon (String myProfession, String myMedPlan) {
        super(myProfession, myMedPlan);
    }

    @Override
    public void setMedPlan(String mySurgeonMedPlan) {
        mySurgeonMedPlan= "Please do physical exercises and take medication";
    }

    @Override
    public String getMyMedPlan() {
        return "Please do physical exercises and take medication!";
    }

    @Override
    public void curingMethod(String neededPatientPlan){
        System.out.println("Your disease code is: "+ neededPatientPlan);
        System.out.println("Your treatment prescription: "+getMyMedPlan());
    }
}
