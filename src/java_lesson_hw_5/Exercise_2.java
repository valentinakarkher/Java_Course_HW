package java_lesson_hw_5;

import java.util.WeakHashMap;

public class Exercise_2 {
    /*Задача 2:
    Создать программу для раскраски шахматной доски с помощью цикла. Создать
    двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    B(Black) или W(White). При выводе результат работы программы должен быть
    следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W    */
    public static void main(String[]args){
        doChessTable();
    }
    public static void doChessTable(){
        String[][]chessTableArray = new String [8][8];
        String white ="W";
        String black ="B";
        for (int row =0; row< 8;row++){
            for(int col=0; col< 8;col++){
                if((row+col)%2==0){
                    chessTableArray[row][col]=white;
                }
                else {
                    chessTableArray[row][col]=black;
                }
                System.out.print(chessTableArray[row][col]+"\t");
                }
            System.out.println();
                }


            }

        }


