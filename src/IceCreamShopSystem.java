public class IceCreamShopSystem {
    public static void main(String[] args) {
        IceCreamShop shop = new IceCreamShop(); // Create a new ice cream shop

        // Simulating placing orders
        shop.placeOrder("Chocolate", 5); // Place an order for 5 Chocolate ice creams
        shop.placeOrder("Mint", 3);       // Place an order for 3 Mint ice creams
        shop.placeOrder("Vanilla", 2);    // Place an order for 2 Vanilla ice creams
        shop.placeOrder("Strawberry", 4); // Place an order for 4 Strawberry ice creams

        // Display trending flavors
        shop.displayTrendingFlavors(); // Show the trending flavors based on sales
    }
}