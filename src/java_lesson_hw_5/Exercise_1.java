package java_lesson_hw_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {
    /*Задача 1:
            1.1 Создать двумерный массив, заполнить его случайными числами.
            1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
            1.3 Найти сумму всех получившихся элементов и вывести в консоль.
            */
    public static void main(String[] args){
        getSumOfElements();
    }
    public static void getSumOfElements(){
        Random numbers= new Random();
        int[][] array = new int [3][4];
        System.out.println("Random ARRAY:");

        for(int row=0; row<array.length; row++){
            for(int col = 0; col<array[row].length;col++){
                array[row][col]=numbers.nextInt(100);
                System.out.print(array[row][col]+"\t");

            }
            System.out.println();
        }


        for(int row=0; row<array.length;row++){
            for(int col=0;col< array[row].length;col++){
                System.out.print("Please enter new numbers to array["+row+"]"+"["+col+"]: ");
                Scanner input= new Scanner(System.in);
                int number= input.nextInt();
                array[row][col]+=number;
        }
        }
        System.out.println();
        System.out.println("YOUR NEW ARRAY VALUES: ");

        for(int[]row :array){
           for(int element :row){
               System.out.print(element+"\t");
           }
            System.out.println();
            }


        }









    }

