public class Order {
    private IceCream iceCream; // Ice cream associated with the order
    private int quantity;       // Quantity of ice creams ordered

    // Constructor
    public Order(IceCream iceCream, int quantity) {
        this.iceCream = iceCream;
        this.quantity = quantity;
    }

    // Method to fulfill the order
    public void fulfillOrder() {
        for (int i = 0; i < quantity; i++) {
            iceCream.incrementSold(); // Increment the sold count for each ice cream ordered
        }
    }

    // Getter for ice cream
    public IceCream getIceCream() {
        return iceCream;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }
}
