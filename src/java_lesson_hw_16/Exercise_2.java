package java_lesson_hw_16;

import java.util.Arrays;
import java.util.HashMap;

public class Exercise_2 {
    /*
Задача 2:
На вход поступает массив непустых строк, создайте и верните Map<String,
String> следующим образом: для каждой строки добавьте ее первый символ в
качестве ключа с последним символом в качестве значения. Пример:
pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
*/
    public static void main(String[] args) {
        System.out.println(getSymbols(new String[]{"man", "moon", "good", "night", "mother","weather"}));
    }
    public static HashMap<String,String> getSymbols(String[] str){
        HashMap<String,String> strMap = new HashMap<>();
        char[] letters ;
        for(String string : str){
           letters = string.toCharArray();
           String key = String.valueOf(letters[0]);
            String value = String.valueOf(letters[letters.length-1]);
           strMap.put(key,value);
        }
    return strMap;}
}
