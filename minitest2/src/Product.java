public class Product {
    private int id;
    private String name;
    private Double price;
    private int quantity;
    private static String storeName = "Kho Tổng ABC";
    private static int totalProduct;
    private static double totalInventoryValue;

    public Product(int id, String name, Double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Price: " + price + " Quantity: " + quantity + " Store: " + storeName);
    }

    double getInventoryValue() {
        return price * quantity;
    }

    static double getAveragePrice(Product arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].price;
        }
        return sum / arr.length;
    }

    static String getStoreName(Product arr[], String productName) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(productName)) {
                return arr[i].storeName;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static int getTotalProduct() {
        return totalProduct;
    }

    public static double getTotalInventoryValue() {
        return totalInventoryValue;
    }

    public static void setStoreName(String storeName) {
        Product.storeName = storeName;
    }
}
