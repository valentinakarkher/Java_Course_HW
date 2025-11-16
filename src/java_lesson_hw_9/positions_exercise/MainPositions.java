package java_lesson_hw_9.positions_exercise;

public class MainPositions {
    public static void main(String[] args) {
        printPositions();
    }
 public static void printPositions(){
        Director director = new Director();
        director.printPosition();

        Accountant accountant = new Accountant();
        accountant.printPosition();

        Worker worker= new Worker();
        worker.printPosition();
 }
}
