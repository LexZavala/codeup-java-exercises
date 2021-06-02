package shapes;
import util.Input;

import java.text.DecimalFormat;

public class CircleApp {

    public static void main(String[] args) {
        Input test =  new Input();
        Circle circle = new Circle(test.getDouble());
        DecimalFormat f = new DecimalFormat("#.##");
        double area = (circle.getArea());
        System.out.println("Area of the circle is " + f.format(area));
        double circ = (circle.getCircumference());
        System.out.println("Circumference is " + f.format(circ));


    }

}
