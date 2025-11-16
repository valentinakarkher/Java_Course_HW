package java_lesson_hw_9.figures;

public class MainFigure {
    public static void main(String[] args) throws CloneNotSupportedException{
        createFigures();
        createFiguresArray();
        cloneFigure() ;
    }
  public static void createFigures(){
        Rectangle rectangle = new Rectangle(7,10);
       System.out.println(rectangle.toString());

        Circle circle = new Circle(7);
       System.out.println(circle.toString());

        Triangle triangle = new Triangle(7, 5, 8);
       System.out.println(triangle.toString());

    }
    public static void createFiguresArray(){
        Figure[] figures = new Figure[]{
                new Rectangle(5,12),
                new Circle(12),
                new Triangle(8,5,10),
                new Rectangle(21,57),
                new Circle(4)

        };
        double perimeterSum=0.0;
        for(Figure figure: figures) {
            perimeterSum += figure.getPerimeterOfFigure();

        }System.out.println("Perimeters Sum: " +perimeterSum+"m");


    }
    public static void cloneFigure() throws CloneNotSupportedException{
        Figure origRectangle= new Rectangle(3,7);
        Figure clonedRectangle = origRectangle.clone();
        System.out.println("Cloned rectangle:"+clonedRectangle);
        System.out.println(origRectangle==clonedRectangle);
    }
}
