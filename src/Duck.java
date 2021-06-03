public class Duck extends Bird {
// Duck has access to bird's public methods
// Duck inherits the public methods
// Duck is the subclass of the Bird superclass

//    Override
    public void makeNoise(){
        super.makeNoise();
//        System.out.println(this.getName() + " goes Quack Quack!");
        System.out.println("Quack Quack");
    }
}
