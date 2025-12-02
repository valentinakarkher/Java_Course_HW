package java_lesson_hw_12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_1 {

    /*Блок 2. Домашнее задание

Задача 1:
Вывести в консоль из строки которую пользователь вводит с клавиатуры все
аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
только из прописных букв, без чисел.
    */

    public static void main(String[]args){

        getAbbreviation();
        getInput();
    }
    public static Scanner getInput(){
        return new Scanner(System.in);
    }
    public static void getAbbreviation(){
        System.out.print("Введите ряд слов без запятых с пробелами : ");
        String str= getInput().nextLine();
        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));
        System.out.println("Аббревиатуры из строки: ");

        for (String st : strings){
            Pattern pattern= Pattern.compile("[А-я]{2,5}");
            Matcher matcher = pattern.matcher(st);
            if (matcher.matches()){
                System.out.println(st);
            }

        }
    }


}


