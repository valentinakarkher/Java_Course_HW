package java_lesson_hw_9.figures;

public class Triangle extends Figure{
    public Triangle (int sideOne, int sideTwo, int sideThree){
        super (sideOne, sideTwo, sideThree);
    }

    @Override
    public double getPerimeterOfFigure(){
        int perimeter= getSideOne()+getSideTwo()+getSideThree();


        return perimeter;
    }
    @Override
    public double getSquareOfFigure(){
        double halfPerimeter= (getSideOne()+getSideTwo()+getSideThree())/2;
        double square = halfPerimeter*(halfPerimeter-getSideOne())*(halfPerimeter-getSideTwo())*(halfPerimeter-getSideThree());

        return square;

    }
    @Override
    public String toString(){
        return "Triangle perimeter is :"+getPerimeterOfFigure() +"m"+"\n"
                +"Triangle square is: "+ Math.sqrt(getSquareOfFigure())+"m2"+"\n";
    }
}
