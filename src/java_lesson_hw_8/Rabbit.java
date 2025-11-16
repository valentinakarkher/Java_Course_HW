package java_lesson_hw_8;

public class Rabbit extends Animal {
    public Rabbit(String type,String age, String color, String gender){
        super (type, age,color,gender);
    }
    /*Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    или другую строку то он будет недоволен.*/
    @Override
    public void voice(){
        System.out.println("Rabbit doesn't have a specific sound!");
    }

    @Override
    public void eat(String food) {
        if (food == "meat") {
            System.out.println("Rabbit doesn't eat meat! Rabbit likes eating the grass! Rabbit is unhappy...");
            System.out.println("Food for rabbit : grass");
        } else if (food == "grass") {
            System.out.println("Rabbit likes to eat the grass! Rabbit is happy!");

        }else{ System.out.println("Rabbit doesn't eat "+food);
            System.out.println("Rabbit likes to eat the grass! Rabbit is unhappy...");}

    }
}
