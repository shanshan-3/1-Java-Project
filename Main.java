import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MenuItem M1 = new MainCourse("Chickenjoy ", 96.99);
        MenuItem M2 = new MainCourse("Burger Steak", 105.99);  
        MenuItem M3 = new MainCourse("Jolly Spaghetti", 77.25);   

        MenuItem B1 = new Beverage("Coke", 19.99); 
        MenuItem B2 = new Beverage("Sprite", 19.99);
        MenuItem B3 = new Beverage("Royal", 19.99);

        MenuItem D1 = new Dessert("Ube Pie", 45.00);
        MenuItem D2 = new Dessert ("Vanilla Sundae", 39.00);
        MenuItem D3 = new Dessert("Peach Mango Pie", 45.00);
        
        MenuItem[] menuItems = {M1, M2, M3, B1, B2, B3, D1, D2, D3};

        double total = 0;
        double orderTotal;
        boolean Ordering = true;
        String Orders = "";


        System.out.println("Welcome to Jollibee!");
        System.out.println("How can we serve you today?\n");
        
        System.out.println("-------- JOLLIBEE MENU ---------");
        for(int i = 0; i < menuItems.length; i++) {
            System.out.println(i + 1 + ". " + menuItems[i].getName() + " - PHP" + " "+ menuItems[i].getPrice());
            System.out.println("--------------------------------"); 
        }
        
         while (Ordering) {
            System.out.print("\nPlease select the number you want to order: ");
            int choice = scanner.nextInt();
            System.out.print("How many Sir/Maam: ");
            int quantity = scanner.nextInt();

            if (choice > 0 && choice <= menuItems.length) {
                MenuItem selectedItem = menuItems[choice - 1];
                orderTotal = selectedItem.getPrice() * quantity;

                total = total + orderTotal;

                Orders = Orders + quantity + " x " + selectedItem.getName() + " - PHP " + orderTotal + "\n";

                selectedItem.placeOrder(quantity);

                System.out.print("Anything else? (yes/no): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("no")) {
                    Ordering = false;
                }
            }
        }

    
        System.out.println("\n--------------- RECEIPT --------------");
        System.out.println(Orders);
        System.out.println("Total: PHP " + total);
        System.out.println("Thank you for ordering at Jollibee!");
        System.out.println("--------------------------------------");

        scanner.close();
    }
}