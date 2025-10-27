package java_lesson_hw_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {
     /*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.*/
    public static void main(String []args){
        findIndexOfNumber();
    }
    public static void findIndexOfNumber(){
        System.out.print("Please enter size of array :");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int [] array = new int[length];
        System.out.println("You have entered size of array!");
        System.out.println("Please fill the array with numbers :");
        for(int index=0; index<length; index++){
            System.out.print("Value ["+index+"] :");
            array[index]= input.nextInt();
        }

        int min = array[0];
        int minIndexOut=0;

        for(int indexMin = 1; indexMin<length;indexMin++){
            if(array[indexMin]<min){
                min=array[indexMin];
                minIndexOut=indexMin;
            }
        }
        System.out.println("Min number's index :"+minIndexOut);

        int max= array[0];
        int maxIndexOut= 0;

        for(int indexMax=1; indexMax<length;indexMax++){
            if(indexMax>max){
                max=array[indexMax];
                maxIndexOut=indexMax;
            }

        }
        System.out.println("Max number's index :"+maxIndexOut);





    }
}
