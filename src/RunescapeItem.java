public class RunescapeItem {
    private final String itemName;
    private final double price;
    private final int id;

    public RunescapeItem(int id, String itemName, double price) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + itemName + " : " + price;
    }
}
