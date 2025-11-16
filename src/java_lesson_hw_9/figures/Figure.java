package java_lesson_hw_9.figures;

public abstract class Figure implements Clonable{
    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private int radius;
    /*Задача 2:
    Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
    функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
    абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
    периметра всех фигур в массиве.
            Задача *:
    Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.*/
    public Figure(int sideOne, int sideTwo,int sideThree){
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;

    }
    public Figure(int sideOne, int sideTwo){
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
    }
    public Figure(int radius){
        this.radius=radius;
    }


    public int getSideOne() {
        return sideOne;
    }

    public int getRadius() {
        return radius;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }

    public double getSquareOfFigure(){
        return 0.0;

    }
    public double getPerimeterOfFigure(){

        return 0.0;
    }
@Override
public Figure clone() throws CloneNotSupportedException {
        return (Figure) super.clone();
}
}
