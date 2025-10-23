package java_lesson_hw_2;

import java.util.Scanner;

public class Exercise_1 {
    //Задача 1:
    //Напишите программу, которая будет принимать на вход число из консоли и на выход
    //будет выводить сообщение четное число или нет. Для определения четности числа
    //используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void main (String[]args){
        getEvenNumbers ();

    }

    public static void getEvenNumbers (){

        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 ==0){
            System.out.println("You have entered even number!");
        }else {
            System.out.print("You have entered odd number!");
        }
    }





}
