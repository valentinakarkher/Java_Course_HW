package java_lesson_hw_4;

import java.util.Scanner;

public class Exercise_4 {
     /*Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет.*/

    public static void main (String[]args){
        findZeroElements();

    }
    public static void findZeroElements(){
        System.out.print("Please enter size of array :");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int [] array = new int[length];
        System.out.println("You have entered size of array!");
        for(int index= 0; index< length;index++){
            array[index]=(int)(Math.random() * 10);
        }

        for(int index= 0; index< length;index++){
        System.out.println("Your array's values: "+array[index]);
        }
        int zeroElement =0;
        for(int arrays: array) {
            if(arrays==0){
                zeroElement++;

            }
        }
        if(zeroElement>0){
        System.out.println("Number of zero elements is : "+zeroElement);
        }else System.out.println("THERE IS NO ANY ZERO ELEMENT!");

        }

    }


