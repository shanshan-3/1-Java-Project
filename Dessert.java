public class Dessert extends MenuItem implements Order {

    public Dessert(String itemName, double price) {
        super(itemName, price);
    }

    @Override
    public void placeOrder(int quantity) {
        System.out.println("Order placed for " + quantity + " " + getName());
    }
}
