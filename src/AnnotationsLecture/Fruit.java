package AnnotationsLecture;

public class Fruit implements Food {

    @Deprecated
    private boolean hasFlesh;

    private boolean eatableSeeds;

    public static void main(String[] args) {
        Fruit lime =  new Fruit();

    }

    @Override
    public String taste() {
        return null;
    }
}
