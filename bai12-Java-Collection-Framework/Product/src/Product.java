import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String ID;
    private String name;
    private int quantity;
    private double price;

    public Product(String ID, String name, int quantity, double price) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price);
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(getTotalPrice(), o.getTotalPrice());
    }
}
