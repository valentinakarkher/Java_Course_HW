package java_lesson_hw_2;

public class Exercise_4 {
    //Задача 4:
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void main (String []args){
        setNumbersLine();
    }

    public static void  setNumbersLine(){
        int number =0;
        while (true){
            System.out.println(number+=7);
            if(number==98){
                return;
            }

        }
    }
}
