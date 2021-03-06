package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public int getPerimeter() {
        return 2 * length + 2 * width;
    }

    public int getArea() {
        return length * width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
         this.width = width;
    }

//    OLD WAY WITHOUT ABSTRACT OR INTERFACE
//    protected double length;
//
//    protected double width;
//
//    public Rectangle (double len,  double wid){
//        this.length = len;
//        this.width = wid;
//    }
//
//    public Rectangle (){}
//
//    public double getArea () {
//        return length * width;
//    }
//
//    public double getPerimeter (){
//        return 2 * length + 2 * width;
//    }
}
