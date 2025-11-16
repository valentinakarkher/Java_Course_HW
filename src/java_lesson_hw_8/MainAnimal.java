package java_lesson_hw_8;

public class MainAnimal {
    /*Задача 1:
    Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.

    Переопределить методы voice(), eat(String food) чтобы они выводили верную
    информацию.
    Метод eat может принимать “Meat”, “Grass” и другие строки.
            Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
    туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
    или другую строку то он будет недоволен.
            Задача *:
    Написать такой конструктор, который запретит создание объекта класса Dog в других
    классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
    обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
            способа*/

    public static void main(String[] args) {
        createRabbit();
        createTiger();
    }
    public static void createRabbit(){
        Animal rabbit = new Rabbit("rabbit","1","white","male");

        rabbit.voice();
        rabbit.eat("grass");
    }
    public static void createTiger(){

        Animal tiger = new Tiger("amur tiger","5","orange","female");
        tiger.voice();
        tiger.eat("meat");

        Animal privateDog= Dog.createPrivateDogElement();
        System.out.println(privateDog);
        Dog.createPrivateDogElement().voice();
        Dog.createPrivateDogElement().eat("grass");

    }
}
