package java_lesson_hw_7.apple;

public class Apple {
   /* Создать класс Apple и добавить в него поле color с модификатором доступа private и
    инициализировать его. В методе main другого класса создать объект Apple, и не
    используя сеттеры изменить значение поля color*/

   private String color="Red";

   public Apple(String myColor){
       color = myColor;

       System.out.println("Apple's color is: "+myColor);
   }


}
