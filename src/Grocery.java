import java.util.ArrayList;

public class Grocery {

    private String name;
    private ArrayList<Integer> quantity;

    public Grocery (String name)  {
            this.name = name;
            this.quantity = new ArrayList<>();
        }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

}
