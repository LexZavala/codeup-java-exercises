package BirdsLecture;

import BirdsLecture.Bird;

public class Penguin extends Bird {
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk!");
    }

//    override move
    public void move(){
        System.out.println(this.getName() +  " goes woddle woddle");
    }
}
