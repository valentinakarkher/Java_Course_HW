package java_lesson_hw_1;


public class Exercise_2 {
    public static void main(String[] args){
        calculateValue();
    }

    //Задача 1:
    //Написать приложение, которое будет вычислять и выводить значение по формуле:
    //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static void calculateValue(){
        int b = 100;
        double c = 13;
        double a = 4 * ( b + c - 1) / 2;
        System.out.println("a = 4 * ( b + c - 1) / 2 =" +a);
}
}
