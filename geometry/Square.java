package geometry;

public class Square extends Rectangle {
    public Square(double width){
        super(width, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                '}';
    }

    public double getWidth(){
        return width;
    }
}
