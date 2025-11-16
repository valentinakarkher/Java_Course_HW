package java_lesson_hw_8;

public class Dog extends Animal {
    private Dog (String type, String age, String color, String gender){
        super (type, age, color, gender);

    }


    public static Dog createPrivateDogElement(){
        return new Dog("Caucasian hound","7","white","female");

    }
    @Override
    public void voice(){
        System.out.println("Dog is barking!");
    }

    @Override
    public void eat(String food){
        if (food=="meat"){
            System.out.println("Dog eats meat!");
            System.out.println("Food for dog :"+ food);
        }else System.out.println("Dog eats only meat! Dog can't eats "+food);

    }
    @Override
    public String toString(){

        return "Dog type is "+getType()+"\n"
                +"\t"+"Dog age is "+getAge()+"\n"
                +"\t"+"Dog color is "+getColor()+"\n"
                +"\t"+"Dog gender is "+getGender()+"\n";

    }


}


