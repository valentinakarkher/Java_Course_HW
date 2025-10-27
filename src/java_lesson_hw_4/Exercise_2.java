package java_lesson_hw_4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2 {
    /*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.*/
    public static void main(String[]args){
        setArray();
    }

    public static void setArray(){

        System.out.print("Please enter size of array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] mass = new int[size];
        System.out.println("You have entered size of array!");
        for(int index = 0;index<size; index++){
        System.out.println("Please enter number for index ["+(index)+"] :");
        mass[index]=input.nextInt();
        }
        Arrays.sort(mass);
        System.out.println("Min element :"+ mass[0]);
        System.out.println("Max element :"+ mass[size-1]);



    }
}
