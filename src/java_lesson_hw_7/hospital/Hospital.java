package java_lesson_hw_7.hospital;

public class Hospital {
    public static void main(String [] arg){
        createDoctor();
    }
    public static void createDoctor(){
        Doctor therapist = new Therapist("therapist","therapistPlan");
        Doctor dentist = new Dentist("dentist", "dentistPlan");
        Doctor surgeon = new Surgeon("surgeon", "surgeonPlan");
        Patient usualPatient = new Patient ("therapist","code 1");

        therapist.curingMethod("code2");

       surgeon.curingMethod("code1");

       dentist.curingMethod("code1");
    }
}
