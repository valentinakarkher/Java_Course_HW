package java_lesson_hw_15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise_1 {
  /*  Задача 1:
    Пользователь вводит набор чисел в виде одной строки с клавиатуры.
    Например: "1, 2, 3, 4, 4, 5".
    Избавиться от повторяющихся элементов в строке.
    Вывести результат на экран.
    При решении использовать коллекции.

    */
  public static void main(String[] args) {
      getUniqueValues();
      getInput();
  }
  public static void getUniqueValues(){
      System.out.print("Please enter numbers with space WITHOUT SYMBOLS: ");
      String numbers = getInput().nextLine();
      String [] number = numbers.split("\\s+");
      HashSet<String>uniqueNum = new HashSet<>();
      for (String num : number){
          uniqueNum.add(num);
      }
      System.out.println(uniqueNum);
  }
  public static Scanner getInput(){
      return new Scanner(System.in);
  }
}
