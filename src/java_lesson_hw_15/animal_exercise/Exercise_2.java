package java_lesson_hw_15.animal_exercise;

public class Exercise_2 {
     /*
    Задача 2:
    Создать класс, который будет хранить в себе коллекцию с названиями животных.
    Реализовать методы удаления и добавления животных по следующим правилам:
    добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
    объекта этого класса в main методе другого класса.
    */
     public static void main(String[] args) {
         createAnimal();
     }
public static void createAnimal(){
         Animals newAnimals = new Animals();
         newAnimals.addAnimal("Lion");
         newAnimals.addAnimal("Zebra");
         newAnimals.addAnimal("Crocodile");
         newAnimals.addAnimal("Elephant");
         newAnimals.addAnimal("Giraffe");
         newAnimals.printAnimal();
    System.out.println("-".repeat(100));
         newAnimals.deleteAnimal();
         newAnimals.printAnimal();
    System.out.println("-".repeat(100));
    newAnimals.addAnimal("Fox");
    newAnimals.printAnimal();
     }
}

