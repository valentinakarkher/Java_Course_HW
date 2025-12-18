package java_lesson_hw_15.animal_exercise;

import java.util.LinkedHashSet;

public class Animals {
    private LinkedHashSet <String> animalsSet = new LinkedHashSet<>();
    public Animals(){}
    public void addAnimal(String newAnimal){
        this.animalsSet.addFirst(newAnimal);
    }
    public void deleteAnimal(){
        this.animalsSet.removeLast();
    }
    public void printAnimal(){
        this.animalsSet.forEach(animal-> System.out.println("Animal : "+animal));
    }
}
