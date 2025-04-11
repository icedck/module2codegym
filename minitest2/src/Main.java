//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product[] = { new Product(001, "cake", 5000.0, 30),
                new Product(002, "candy", 3000000.0, 1),
                new Product(003, "snack", 5000000.0, 6),
                new Product(004, "milk", 6000.0, 50),
                new Product(005, "water", 8000.0, 20),
        };
        System.out.println("Danh sách sản phẩm: ");
        extracted(product);
        System.out.println("Tìm kiếm sản phẩm theo tên chính xác: ");
        findName(product, "cake");
        System.out.println("Danh sách các sản phẩm có giá > 1000000: ");
        displayProduct(product);
        System.out.println("sản phẩm có số lượng tồn kho lớn nhất: ");
        LargestInventory(product);
        System.out.println("tổng số sản phẩm: " + countProduct(product) + ", tổng giá trị tồn kho: " +
                totalInventoryValue(product) + ", giá trung bình: " + Product.getAveragePrice(product));
        System.out.println("Thay đổi tên kho: ");
        Product.setStoreName("Kho miền Nam");
        extracted(product);
    }


    public static void extracted(Product[] product) {
        for (int i = 0; i < product.length; i++) {
            product[i].display();
        }
    }

    public static String findName(Product arr[], String ProductName){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(ProductName)) {
                arr[i].display();
            }
        }
        return "Không tìm thấy";
    }

    public static void displayProduct(Product arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].price > 1000000){
                arr[i].display();
            }
        }
    }

    public static void LargestInventory(Product arr[]){
        int max = arr[0].quantity;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].quantity){
                max = arr[i].quantity;
                arr[i].display();
            }
        }
    }

    public static int countProduct(Product arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    public static double totalInventoryValue(Product arr[]){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getInventoryValue();
        }
        return total;
    }

}