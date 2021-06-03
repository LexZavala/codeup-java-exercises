package BirdsLecture;

public class BirdTest {
    public static void main(String[] args) {
//        BirdsLecture.Bird cardinal = new BirdsLecture.Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();
//        BirdsLecture.Penguin penguin = new BirdsLecture.Penguin();
//        penguin.setName("Happy Feet");
//        penguin.setCanFly(false);
//        penguin.move();
//        penguin.makeNoise();

//        Polymorphism allows us to have different reference and object types
        Bird myPenguin = new Penguin();

    }
}
