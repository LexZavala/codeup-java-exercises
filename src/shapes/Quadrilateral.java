package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;

    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract int setLength(int length);
    public abstract int setWidth (int width);


}
