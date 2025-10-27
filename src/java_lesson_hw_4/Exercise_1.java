package java_lesson_hw_4;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {
    /*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/


    public static void main(String[] args) {
        setArray();
    }

    public static void setArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива (просто целое число): ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int index = 0; index < length; index++) {
            System.out.println("Вы задали размер массива!");
            System.out.print("Введите значение массива №" +(index+1)+" :");
            array[index] = input.nextInt();
        }
        System.out.println("Ваш массив: ");
        for (int index= 0; index<length; index++) {
            System.out.println("array[" + index + "]" + array[index]);
        }
        System.out.println("Ваш массив в обратном порядке: ");
        for (int index= length-1; index >=0; index--) {
            System.out.println("array[" + index + "]" + array[index]);
        }



    }

}