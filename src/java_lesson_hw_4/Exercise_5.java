package java_lesson_hw_4;

import java.util.Scanner;

public class Exercise_5 {
     /*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй и
предпоследний и т.д. */

    public static void main(String[] args) {
        findZeroElements();

    }

    public static void findZeroElements() {
        System.out.print("Please enter size of array :");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("You have entered size of array!");
        for (int index = 0; index < length; index++) {
            array[index] = (int) (Math.random() * 10);
        }

        for (int index = 0; index < length; index++) {
            System.out.println("Your array's values["+(index+1)+"]: " + array[index]);

        }
        int halfLength=array.length;

        for(int index =0;index<halfLength/2;index++ ){
            int value= array[index];
            array[index]=array[halfLength-1-index];
            array[halfLength-1-index]=value;
        }

            for(int index=0;index<array.length;index++) {

                System.out.println("Changed array values["+(index+1) + "]: " + array[index]);
            }
    }
}
