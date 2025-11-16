package java_lesson_hw_9.positions_exercise;

public class Worker implements NamePositionInterface{
private final String position = "Worker";

    @Override
    public void printPosition() {
        System.out.println("Position is: "+position);
    }
}
