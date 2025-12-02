package java_lesson_hw_11;

import java.util.Scanner;

public class String_Exercise_4 {
    public static void main(String[]args){
        getInput();

        String word="";
        isCharDifferent(word);
        getDifferentCharWord();

    }
    public static Scanner getInput(){
        return new Scanner(System.in);
    }

    /*4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.*/
    public static void getDifferentCharWord(){
        String [] strings= new String [3];
        System.out.println("Please enter word for 3 strings : ");
        for(int index=0; index<3; index++){
            System.out.print("String "+(index+1)+" : ");
            strings[index] = getInput().nextLine();
        }
        for(String str:strings){
            if(isCharDifferent(str)){
                System.out.println("Word with all chars are different: "+str);return;
            }
        }System.out.println("THERE IS NO WORD WITH DIFFERENT CHARS");
    }
    public static boolean isCharDifferent(String word){
        for(int index=0; index<word.length(); index++){
            for(int afterIndex=index+1;afterIndex<word.length();afterIndex++){
                if(word.charAt(index)==word.charAt(afterIndex))return false;
            }
        } return true;
    }

}
