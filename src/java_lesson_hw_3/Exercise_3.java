package java_lesson_hw_3;

public class Exercise_3 {
    //Задача 3:
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
public static void main (String []args){
    setSquareNumber();
}

    public static void  setSquareNumber() {
    for(int counter=10; counter<=20; counter++){
        System.out.println("Square number of ("+counter+") : "+counter*counter);
    }
    }
}
