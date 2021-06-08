package AnnotationsLecture;

public class Fruit implements Food {

    @Deprecated
    private boolean hasFlesh;

    private boolean eatableSeeds;
    private String flavor;

    @Override
    public String taste() {
        return this.flavor;
    }

    public static void main(String[] args) {
        Fruit lime =  new Fruit();


    }
}
