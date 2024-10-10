import java.util.*;
public class IceCreamShop {
    private List<IceCream> iceCreamFlavors; // List of available ice cream flavors

    // Constructor to initialize the ice cream flavors
    public IceCreamShop() {
        iceCreamFlavors = new ArrayList<>();
        initializeFlavors(); // Populate the shop with flavors
    }

    // Method to initialize ice cream flavors
    private void initializeFlavors() {
        String[] flavors = {
                "Vanilla", "Chocolate", "Strawberry", "Mint", "Cookies & Cream",
                "Mango", "Pistachio", "Coffee", "Lemon", "Rocky Road",
                "Raspberry", "Green Tea", "Caramel", "Butter Pecan", "Cotton Candy",
                "Peanut Butter Cup", "Cherry", "Tiramisu", "Pineapple", "Neapolitan"
        };
        for (String flavor : flavors) {
            iceCreamFlavors.add(new IceCream(flavor)); // Add each flavor to the list
        }
    }

    // Method to place an order
    public void placeOrder(String flavor, int quantity) {
        for (IceCream iceCream : iceCreamFlavors) {
            if (iceCream.getFlavor().equalsIgnoreCase(flavor)) {
                Order order = new Order(iceCream, quantity);
                order.fulfillOrder(); // Fulfill the order
                System.out.println("Order placed for " + quantity + " " + flavor + " ice cream(s).");
                return; // Exit the method after placing the order
            }
        }
        System.out.println("Flavor not available."); // If flavor not found
    }

    // Method to display trending flavors based on sales
    public void displayTrendingFlavors() {
        // Sort flavors by the number sold in descending order
        iceCreamFlavors.sort((a, b) -> b.getSold() - a.getSold());
        System.out.println("Trending Ice Cream Flavors:");
        for (IceCream iceCream : iceCreamFlavors) {
            if (iceCream.getSold() > 0) {
                System.out.println(iceCream.getFlavor() + ": " + iceCream.getSold() + " sold");
            }
        }
    }
}
