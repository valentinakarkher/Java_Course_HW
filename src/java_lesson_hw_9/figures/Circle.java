package java_lesson_hw_9.figures;

public class Circle extends Figure{
    public Circle(int radius){
        super(radius);
    }

    @Override
    public double getPerimeterOfFigure(){
        double perimeter;
        perimeter = 2*getRadius()*3.14;

        return perimeter;
    }
    @Override
    public double getSquareOfFigure(){
       double square = 3.14*getRadius()*getRadius();

        return square;
    }
    @Override
    public String toString(){
        return "Circle perimeter is :"+getPerimeterOfFigure() +"m"+"\n"
                +"Circle square is: "+getSquareOfFigure()+"m2"+"\n";

    }
}
