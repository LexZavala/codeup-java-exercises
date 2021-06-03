public class Duck extends Bird {
// Duck has access to bird's public methods
// Duck inherits the public methods

//    Override
    public void makeNoise(){
        System.out.println(this.getName() + " goes Quack Quack!");
    }
}
