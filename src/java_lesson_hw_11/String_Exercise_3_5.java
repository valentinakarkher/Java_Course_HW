package java_lesson_hw_11;

import java.util.Scanner;

public class String_Exercise_3_5 {

    public static void main(String[]args){
        getInput();
        getShortStrings();
        setDoubleLetter();
    }
    public static Scanner getInput(){
        return new Scanner(System.in);
    }
    /*Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину.*/
    public static void getShortStrings(){
        String [] strings= new String [3];
        System.out.println("Please enter value for 3 strings : ");
        for(int index=0; index<3; index++){
            System.out.print("String "+(index+1)+" : ");
            strings[index] = getInput().nextLine();
        }

        int medLength= (strings[0].length()+strings[1].length()+strings[2].length())/3;
        for(String str:strings) {
            if (str.length()<medLength){
                System.out.print("String what Shorter than medium length is : "+str+"\n" +
                        "Its length is: "+str.length()+"\n");
            }
        }

    }

    /*
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo".*/
    public static void setDoubleLetter(){
        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Original String is : "+str);
        str.insert(0,'H');
        str.insert(2,'e');
        str.insert(4,'l');
        str.insert(6,'l');
        str.insert(8,'o');
        System.out.println("Changed String is : "+str);

    }
}
