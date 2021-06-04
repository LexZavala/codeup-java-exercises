package KitchenApp;

import java.util.Scanner;

public class Refrigerator extends Appliance implements StoreFood {


    private boolean hasShelves;

    public boolean isHasIce() {
        return hasShelves;
    }

    public void setHasShelves(boolean hasShelves){
        this.hasShelves = hasShelves;
    }

    public Refrigerator (String type, String brandName, boolean hasShelves) {
        super(type, brandName);
        this.hasShelves = hasShelves;
    }

    public Refrigerator (String type, String brandName){
        super(type, brandName);
    }

    public void setType (String type){
        this.type = type;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void sayHello (){
        System.out.println("hello");
    }

    public void keepFresh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to put something in the fridge? (Y/N)");
        String userChoice = scanner.nextLine();
        while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            System.out.println("What would you like to put in the fridge?");
            String item = scanner.nextLine();
            System.out.printf("Sounds good, I'll keep your %s cold for you\n", item);
            System.out.println("Would you like me to put anything else? (Y/N)");
            userChoice = scanner.nextLine();
        }
        System.out.println("Okay, thank you, come again!");
    }


}
