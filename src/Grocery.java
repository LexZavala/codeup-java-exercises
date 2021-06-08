public class Grocery {

    private String name;
    private int quantity;

    public Grocery (String name, int quantity)  {
            this.name = name;
            this.quantity = quantity;
        }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
