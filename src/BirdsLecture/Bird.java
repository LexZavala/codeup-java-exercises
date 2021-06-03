package BirdsLecture;

public class Bird {
    private boolean canFly;

    public boolean isCanFly(){
        return canFly;
    }

    public void  setCanFly (boolean canFly) {
        this.canFly = canFly;
    }

//  What kind of bird
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
//        WRONG CODE DONT DO THIS
//        if (this.name.equalsIgnoreCase("BirdsLecture.Duck")){
//            System.out.println("Quack Quack");
//        }

        System.out.println(this.name + " goes ");
    }

    public void move(){
        System.out.println("flap flap");
    }

    public Bird (String nameOfBird, boolean itCanFly){
        this.name =  nameOfBird;
        this.canFly =  itCanFly;
    }

    public Bird(){
        System.out.println("A bird just got created");
        this.canFly = true;
        this.name = "Parrot";
    }

}
