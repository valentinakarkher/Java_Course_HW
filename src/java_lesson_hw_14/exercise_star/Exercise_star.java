package java_lesson_hw_14.exercise_star;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_star {
     /* Задача *:
    Допустим есть txt файл с номерами документов. Номером документа является строка,
    состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
    номер документа с новой строки и в строке никакой другой информации, только номер
    документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
    последовательности docnum(далее любая последовательность букв/цифр) или
    contract(далее любая последовательность букв/цифр).
    - Написать программу для чтения информации из входного файла
    - путь к входному файлу должен задаваться через консоль.
    - Программа должна проверять номера документов на валидность.
    - Валидные номера документов следует записать в один файл-отчет.
    - Невалидные номера документов следует записать в другой файл-отчет,
    - но после номеров документов следует добавить информацию о том, почему этот документ не валиден.*/
     public static void main(String[] args) {
         getValidDocnum();
         getInvalidDocnum();
         getInput();

     }
    public static String getStringDocNum(){
        System.out.print("Please enter correct file path: ");
        String path = getInput().nextLine();
        StringBuilder docSB =  new StringBuilder();
        try(BufferedReader readDoc = new BufferedReader(new FileReader (path))){
            String line;
            while((line = readDoc.readLine())!=null){docSB.append(line+" ");}
        }catch(IOException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
        String doc =docSB.toString();
        return doc;
    }
     public static void getValidDocnum(){
         String [] docArray = getStringDocNum().split("\\s");
         try(BufferedWriter writeValidDoc= new BufferedWriter(new FileWriter("/Users/valentinakarher/IdeaProjects/mymainjava/src/java_lesson_hw_14/exercise_star/valid_doc_num"))){
         for(String docLine :docArray) {
             Pattern docPattern = Pattern.compile("^(?:docnum\\w{9}|contract\\w{7})$");
             Matcher docMatcher = docPattern.matcher(docLine);
             if(docMatcher.find()){
                writeValidDoc.write(docMatcher.group()+"\n");
             }}
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
    public static void getInvalidDocnum(){
        String doc = getStringDocNum().toString();
        String [] docArray = doc.split("\\s");
        try(BufferedWriter writeInValidDoc= new BufferedWriter(new FileWriter("/Users/valentinakarher/IdeaProjects/mymainjava/src/java_lesson_hw_14/exercise_star/invalid_doc_num"))){
            for(String docLine :docArray) {
                Pattern docPattern = Pattern.compile("^(?!(?:docnum\\w{9}|contract\\w{7})$).*$");
                Matcher docMatcher = docPattern.matcher(docLine);
                if(docMatcher.find()){
                    writeInValidDoc.write(docMatcher.group()+" НЕ ВАЛИДНЫЙ НОМЕР!\n"+
                            "Валидный номер документа должен иметь длину 15 символов и начинаться с\n" +
                        "последовательности docnum(далее любая последовательность букв/цифр) или\n" +
                        "contract(далее любая последовательность букв/цифр)."+"\n\n");
                }}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
     public static Scanner getInput(){
       return new Scanner(System.in);
     }
}
