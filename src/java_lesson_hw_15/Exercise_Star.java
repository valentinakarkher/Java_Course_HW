package java_lesson_hw_15;

public class Exercise_Star {
    /*
    Задача *:
    Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
    работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
    основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
    классов(т.е. это generic).
    Предусмотреть операции(методы):
     1. добавления элемента
     2. удаления элемента
     3. получение элемента по индексу
     4. проверка есть ли элемент в коллекции
     5. очистка всей коллекции
    Предусмотреть конструктор без параметров - создает массив размером
    по умолчанию.
     Предусмотреть конструктор с задаваемым размером внутреннего
    массива.
     Предусмотреть возможность автоматического расширения коллекции при
    добавлении элемента в том случае, когда коллекция уже заполнена.*/
    public static void main(String[] args) {
        createArrayListSimulator();
    }
    public static void createArrayListSimulator(){
        ArrayListSimulator<Integer> sim = new ArrayListSimulator<>();
        sim.add(2);
        sim.add(4);
        sim.add(1);
        sim.add(55);
        sim.add(6);
        sim.add(8);
        sim.add(9);
        sim.add(11);
        sim.add(1);
        sim.add(22);
        sim.add(0);
        System.out.println(sim);
        System.out.println("Size is: "+sim.size());
        System.out.println(sim.isExist(1));
        //System.out.println(sim.isExist(null));
        System.out.println(sim.getElement(4));
        sim.deleteElement(2);
        System.out.println(sim);
        sim.deleteElement(22);
        System.out.println(sim);
        sim.deleteElement(55);
        System.out.println(sim);
        sim.clear();
        System.out.println(sim);

    }

}
