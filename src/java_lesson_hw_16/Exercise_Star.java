package java_lesson_hw_16;

import java.util.ArrayDeque;
import java.util.HashMap;

public class Exercise_Star {
     /*
Задача *:
-- Задана строка, которая может иметь внутри себя скобки.
Скобкой считается любой из следующих символов — «(«, «)», «[«, «]», «{«, «}».
-- Проверить сбалансированность расстановки скобок в этой строке. Набор скобок считается
сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
содержащая пары скобок, не сбалансирована, если набор заключенных в нее
скобок не совпадает .
Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
круглых скобок «() ", заключает в себя одну несбалансированную
закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
несбалансированная.
Пример
() - сбалансирована
[()] - сбалансирована
{[()]} - сбалансирована
([{{[(())]}}]) - сбалансирована
{{[]()}}}} - не сбалансирована
{[(])} - не сбалансирована*/
     public static void main(String[] args) {
         if (isBalanced("{}}")){
             System.out.println("СТРОКА СБАЛАНСИРОВАНА!");
         }else System.out.println("СТРОКА НЕ СБАЛАНСИРОВАНА!");
     }
     public static boolean  isBalanced(String string){
         ArrayDeque<Character> braces = new ArrayDeque<>();
         HashMap<Character,Character> bracesMap = new HashMap<>();
         bracesMap.put('}','{');
         bracesMap.put(']','[');
         bracesMap.put(')','(');
         char[] bracesArray = string.toCharArray();
         for(int index = 0; index < bracesArray.length; index++) {
             if(bracesArray[index]=='('||bracesArray[index]=='['||bracesArray[index]=='{'){
                 braces.add(bracesArray[index]);
             } else if (bracesMap.containsKey(bracesArray[index])) {
                 if(braces.isEmpty())return false;
                 if(bracesMap.getOrDefault(bracesArray[index],'-')==braces.getLast()){
                     braces.removeLast();
                 }
             }
         }
         if(braces.isEmpty())return true;
     return false;}
}
