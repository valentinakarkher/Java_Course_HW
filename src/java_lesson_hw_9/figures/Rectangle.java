package java_lesson_hw_9.figures;

public class Rectangle extends Figure{
    public Rectangle(int sideOne, int sideTwo){
        super (sideOne, sideTwo);
    }



    @Override
    public double getPerimeterOfFigure(){
       int perimeter= (getSideOne()+getSideTwo())*2;

        return perimeter;
    }

    @Override
    public double getSquareOfFigure(){
        int square = getSideOne()*getSideTwo();

        return square;
    }
    @Override
    public String toString(){
        return "Rectangle perimeter is: "+getPerimeterOfFigure() +"m"+"\n"
                +"Rectangle square is: "+getSquareOfFigure() +"m2"+"\n";

    }
}
