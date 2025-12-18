package java_lesson_hw_16;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise_1 {
    /*Задача 1:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
строка является ключом, и ее значение равно true, если эта строка встречается в массиве
2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
*/
    public static void main(String[] args) {
        System.out.println(getKeyValue2(new String[]{"a","y","s","d","a","g","s","y"}));
    }

    public static LinkedHashMap<String, Boolean> getKeyValue(String[] str) {
        LinkedHashMap<String, Boolean> stringBooleanMap = new LinkedHashMap<>();
        for (int index = 0; index < str.length; index++) {
            for (int nexIndex =index + 1; nexIndex<str.length; nexIndex++) {
                if (str[index].equals(str[nexIndex])) {
                    stringBooleanMap.put(str[index],true);
                }
            }
        }
        return stringBooleanMap;
    }
    public static LinkedHashMap<String, Boolean> getKeyValue2(String[] str) {
        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();
        for(String st : str){
            counter.put(st,counter.getOrDefault(st,0)+1);
        }
        LinkedHashMap<String, Boolean> stringBoolean = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> el : counter.entrySet()){
            stringBoolean.put(el.getKey(), el.getValue()>=2);
        }
        return stringBoolean;
    }
}
