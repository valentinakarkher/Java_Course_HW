package java_lesson_hw_2;

import java.util.Scanner;

public class Exercise_2 {
    //Задача 2:
    //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void main (String[]args){
        setTemperatureValue();
    }
    public static void setTemperatureValue(){
        System.out.print("Please enter air temperature: ");
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if(t>-5){
            System.out.print("Warm");
        } else if (-5>=t && t> -20) {
            System.out.print("Normal");
        } else if (-20>=t) {
            System.out.print("Cold");
        }
    }
}
