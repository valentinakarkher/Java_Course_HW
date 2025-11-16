package java_lesson_hw_8;

public class Tiger extends Animal {
    public Tiger (String type, String age, String color, String gender){
        super (type, age, color, gender);

    }
    @Override
    public void voice(){
        System.out.println("Tiger is roaring!");
    }

    public void eat(String food){
        if (food=="meat"){
            System.out.println("Tiger eats meat!");
        System.out.println("Food for tiger :"+ food);
    }else System.out.println("Tiger eats only meat! Tiger can't eats "+food);
}
}
