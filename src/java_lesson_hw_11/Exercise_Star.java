package java_lesson_hw_11;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_Star {
    /*
Задача *:
Дана строка произвольной длины с произвольными словами. Написать программу для
проверки является ли любое выбранное слово в строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
в строке 5 слов, а на вход программе передали число 500.
     */
    public static void main(String[]args){

        getPalindrom(10);

    }

    public static void getPalindrom(int wordIndex){
        String str= "шалаш камыш тетрадь дед язык казак беда боб девочка сын";
        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));
        if(wordIndex<11&&wordIndex>0){
            StringBuilder stringsWord = new StringBuilder(strings[wordIndex-1]);
            String strWord= stringsWord.toString(); ;
            String reversedWord = stringsWord.reverse().toString();

            if (strWord.equals(reversedWord)){
                System.out.println("Слово \'"+strWord+"\' номер "+wordIndex+" является палиндромом");

            }else System.out.println("Слово \'"+strWord+"\' номер "+wordIndex+" не является палиндромом");


        }else System.out.println("НЕТ СЛОВА С НОМЕРОМ :"+wordIndex);






    }


}
