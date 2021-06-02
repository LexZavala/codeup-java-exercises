package shapes;

public class Circle {

    private double radius;

    public Circle (double rad) {
        radius = rad;
    }

    public double getRadius (){
        return radius;
    }

    public double getArea(){
        double result =  Math.PI *(radius * radius);
        return result;
    }

    public double getCircumference(){
        double result = 2 * (Math.PI * radius);
        return result;
    }


}
