public class BirdShelterTest {
    public static void main(String[] args) {
//      Polymorphic array
        Bird[] birds = new Bird[2];
        birds[0] = new Duck();
        birds[0].setName("Daffy");
        birds[1] = new Penguin();
        birds[1].setName("Pin");

//        for (int i = 0; i < birds.length; i++){
//            birds[i].makeNoise();
//        }

        BirdShelter healingWings = new BirdShelter();
        healingWings.shelterSounds(birds);

    }
}
