package shapes;

public class Square extends Quadrilateral {
    public Square(int length, int width) {
        super(length, width);
    }

    public int getArea(){
        return length * length;
    }

    public int getPerimeter(){
        return 4 * length;
    }

    public void setLength(int side) {
        this.length = side;
    }

    public void setWidth(int side) {
         this.width = side;
    }


//    OLD WAY WITHOUT ABSTRACT OR INTERFACE
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea(){
//        return length * length;
//    }
//
//    public double getPerimeter(){
//        return 4 * length;
//    }
}
