package BirdsLecture;

import BirdsLecture.Bird;

public class Duck extends Bird {
// BirdsLecture.Duck has access to bird's public methods
// BirdsLecture.Duck inherits the public methods
// BirdsLecture.Duck is the subclass of the BirdsLecture.Bird superclass

//    Override
    public void makeNoise(){
        super.makeNoise();
//        System.out.println(this.getName() + " goes Quack Quack!");
        System.out.println("Quack Quack");
    }
}
