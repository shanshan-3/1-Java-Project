    public class MainCourse extends MenuItem implements Order {

        public MainCourse(String name, double price) {
            super(name, price);
        }

        @Override
        public void placeOrder(int quantity) {
            System.out.println("Order placed for " + quantity + " " + getName());
        }
    }
