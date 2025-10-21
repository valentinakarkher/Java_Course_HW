package java_lesson_hw_1;

public class Exercise_1 {
    public static void main (String [] args){
        setPersonData();

    }

    public static void setPersonData (){
        String name;
        String surname;
        int age;
        float weight;
        boolean isEmployed;

        name ="Valentina";
        surname = "Karkher";
        age = 22;
        weight = 63.5F;
        isEmployed= false;

        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Age:"+age);
        System.out.println("Weight:"+weight);
        System.out.println("Are you employed?:"+isEmployed);

    }




}

