package java_lesson_hw_7.hospital;

public class Therapist extends Doctor {
    public Therapist(String myProfession, String myMedPlan) {
        super(myProfession, myMedPlan);
    }

/*У терапевта создать метод, который будет назначать врача пациенту согласно плану
лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
лечить*/
@Override
public void setMedPlan(String myTherapistMedPlan) {
    myTherapistMedPlan= "Drink warm water, take a good rest and take a prescripted medication";
}

    @Override
    public String getMyMedPlan() {
        return "Please drink warm water, take a good rest and take a prescripted medication";
    }

    @Override
    public void curingMethod(String neededPatientPlan){
    if (neededPatientPlan=="code1"){
        System.out.println("Your disease code is: "+ neededPatientPlan);
        System.out.println("You need to visit surgeon! Please get an appointment to surgeon! "+getMyMedPlan());
    }else if (neededPatientPlan=="code2"){
        System.out.println("Your disease code is: "+ neededPatientPlan);
        System.out.println("You need to visit dentist! Please get an appointment to dentist! "+getMyMedPlan());
    }else {
        System.out.println("Your disease code is: "+ neededPatientPlan);
        System.out.println("You need to visit therapist!"+getMyMedPlan());
    }


    }


}
