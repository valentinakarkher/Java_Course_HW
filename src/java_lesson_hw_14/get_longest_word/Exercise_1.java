package java_lesson_hw_14.get_longest_word;

import java.io.*;

public class Exercise_1 {
    /*Задача 1:
    В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
    Проанализировать и записать в другой файл самое длинное слово.
           .*/
    public static void main(String[] args) {
        getLongestWord();
    }
    public static void getLongestWord(){
    StringBuilder fileLoremIpmsum =  new StringBuilder();
    try(BufferedReader readFile = new BufferedReader(new FileReader ("/Users/valentinakarher/IdeaProjects/mymainjava/src/java_lesson_hw_14/lorem_ipsum"))){
    String line ;
    while((line = readFile.readLine())!=null){
        fileLoremIpmsum.append(line);
    }
    } catch (FileNotFoundException ex) {
        throw new RuntimeException(ex);
    } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
      String file = fileLoremIpmsum.toString();
      String [] fileArray = file.split("\\s+|,\\s*|\\.\\s*|\\?\\s*|!\\s*");
      String maxLength=" ";
      for(String word :fileArray) {
          if(maxLength.length()<word.length()){
              maxLength=word;
          }
      }
      try(BufferedWriter longestWord = new BufferedWriter(new FileWriter("/Users/valentinakarher/IdeaProjects/mymainjava/src/java_lesson_hw_14/longest_word"))){
         longestWord.write(maxLength);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
