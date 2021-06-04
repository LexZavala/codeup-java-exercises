package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 10);
        Measurable myShape2 = new Square(5, 5);

        myShape.getArea();
        myShape.getPerimeter();


//        OLD EXAMPLE BEFORE ABSTRACT AND INTERFACE
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//            Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }
}
