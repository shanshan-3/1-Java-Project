public class Beverage extends MenuItem implements Order {

    public Beverage(String name, double price) {
        super(name, price);
    }

    @Override
    public void placeOrder(int quantity) {
        System.out.println("Order placed for  " + quantity + " " + getName());
    }
    
}