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
//        if (this.name.equalsIgnoreCase("Duck")){
//            System.out.println("Quack Quack");
//        }

        System.out.println("tweet tweet");
    }

    public void move(){
        System.out.println("flap flap");
    }

}
