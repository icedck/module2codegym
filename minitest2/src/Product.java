public class Product {
    int id;
    String name;
    Double price;
    int quantity;
    static String storeName = "Kho Tổng ABC";
    static int totalProduct;
    static double totalInventoryValue;

    public Product(int id, String name, Double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Price: " + price + " Quantity: " + quantity + " Store: " + storeName);
    }
    double getInventoryValue(){
        return price*quantity;
    }
    static double getAveragePrice(Product arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i].price;
        }
        return sum/arr.length;
    }

    static String getStoreName(Product arr[], String ProductName){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(ProductName)) {
                return arr[i].storeName;
            }
        }
        return null;
    }

    public static void setStoreName(String storeName) {
        Product.storeName = storeName;
    }
}
