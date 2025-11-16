package java_lesson_hw_9.positions_exercise;

public class Accountant implements NamePositionInterface {
    private final String position ="Accountant";
    @Override
    public void printPosition() {
        System.out.println("Position is: "+position);

    }
}
