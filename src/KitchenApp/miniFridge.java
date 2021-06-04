package KitchenApp;

public class miniFridge extends Refrigerator implements StoreFood{

    public miniFridge(String type, String brandName) {
        super(type, brandName);
    }

    public void keepFresh(){
        System.out.println("I'm a fridge but smol.");
    }
}
