package java_lesson_hw_13;

public class Exercise_Star {
    /*Задача *:
    Написать try/catch/finally, в котором finally вызван не будет.*/
    public static void main(String[] args) {
        killFinally();
    }
    public static void killFinally(){
        try{
            System.out.println(100/10);
            System.exit(0);
            //чтобы грохнулась программа без выполнения finally я могу закрыть программу на этапе
            // try или я могу написать бесконечный цикл чтобы программа никогда не дошла до finally
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.exit(0);
        } finally {
            System.out.println("Внутри finally");
        }
    }
}
