public class BirdShelter {
    public void shelterSounds(Bird[] array){
        for(int i = 0; i < array.length; i++){
            array[i].makeNoise();
        }
    }
}