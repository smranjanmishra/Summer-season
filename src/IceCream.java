public class IceCream {
    private String flavor;  // Name of the ice cream flavor
    private int sold;       // Count of how many of this flavor have been sold

    // Constructor
    public IceCream(String flavor) {
        this.flavor = flavor;
        this.sold = 0; // Initially, no ice cream sold
    }

    // Only getter
    public String getFlavor() {
        return flavor;
    }

    public int getSold() {
        return sold;
    }

    // Method to increment the sold count
    public void incrementSold() {
        sold++;
    }
}
