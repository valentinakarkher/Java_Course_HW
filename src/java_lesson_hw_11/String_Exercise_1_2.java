package java_lesson_hw_11;

import java.util.Scanner;

public class String_Exercise_1_2 {

    public static void main(String[]args){
        getLongShortString();
        getInput();
        setShortToLongString();
    }
    public static Scanner getInput(){
        return new Scanner(System.in);
    }

    public static void getLongShortString(){
/*1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.*/

        String [] strings= new String [3];
        System.out.println("Please enter value for 3 strings : ");
        for(int index=0; index<3; index++){
            System.out.print("String "+(index+1)+" : ");
            strings[index] = getInput().nextLine();

        }
        String min=strings[0];
        String max= strings[0];

        for(String str: strings){
            if(str.length()<=min.length()) min=str;
            if (str.length()>max.length())max=str;

        }
        System.out.println("The longest string is : "+max);
        System.out.println("The shortest string is : "+min);
    }
    //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
    //значений их длины.
    public static void setShortToLongString(){

        String [] strings= new String [3];
        System.out.println("Please enter value for 3 strings : ");
        for(int index=0; index<3; index++){
            System.out.print("String "+(index+1)+" : ");
            strings[index] = getInput().nextLine();
        }
        String minLength=strings[0];
        String maxLength= strings[0];
        String medium=strings[0];
        for(String str: strings){
            if(str.length()<=minLength.length()) minLength=str;
            if (str.length()>maxLength.length())maxLength=str;
            if(str.length()>minLength.length()&&str.length()<maxLength.length())medium=str;
        }
        for(String str: strings){
            if(str.length()>=minLength.length()&&str.length()<=maxLength.length())medium=str;
        }
        System.out.println("Your 3 strings in short To long : "+"\n"
        +"\t"+minLength+"\n"+
                "\t"+medium+"\n"
        +"\t"+maxLength);

    }

}
