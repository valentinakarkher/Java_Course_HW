package java_lesson_hw_9.positions_exercise;

public class Director implements NamePositionInterface {
    private final String position = "Director";

    @Override
    public void printPosition() {
        System.out.println("Position is: "+position);
    }

    /*Задача 1:
    Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
    который печатает название должности и имплементировать этот метод в созданные
    классы.*/
}
