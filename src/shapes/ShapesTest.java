package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 10);
        Measurable myShape2 = new Square(5, 5);

        System.out.println("Your area is " + myShape.getArea());
        System.out.println("Your perimeter is " + myShape.getPerimeter());

        System.out.println("Your area is " + myShape2.getArea());
        System.out.println("Your perimeter is " + myShape2.getPerimeter());


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
