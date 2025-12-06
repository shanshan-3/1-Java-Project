abstract class MenuItem {

    private String itemName;
    private double price;

    public MenuItem(String name, double price) {
        this.itemName = name;
        this.price = price;
    }

    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    abstract void placeOrder(int quantity);
}


