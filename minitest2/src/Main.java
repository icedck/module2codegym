import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product[] = {new Product(001, "cake", 5000.0, 30),
                new Product(002, "candy", 3000000.0, 1),
                new Product(003, "snack", 5000000.0, 6),
                new Product(004, "milk", 6000.0, 50),
                new Product(005, "water", 8000.0, 20),
        };
        String nameProduct;
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Tìm kiếm sản phẩm theo tên chính xác");
            System.out.println("3. Danh sách các sản phẩm có giá > 1000000");
            System.out.println("4. Sản phẩm có số lượng tồn kho lớn nhất");
            System.out.println("5. Tổng số sản phẩm, tổng giá trị tồn kho, giá trung bình");
            System.out.println("6. Thay đổi tên kho");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm: ");
                    extracted(product);
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Tìm kiếm sản phẩm theo tên chính xác: ");
                    nameProduct = sc2.nextLine();
                    findName(product, nameProduct);
                    break;
                case 3:
                    System.out.println("Danh sách các sản phẩm có giá > 1000000: ");
                    displayProduct(product);
                    break;
                case 4:
                    System.out.println("sản phẩm có số lượng tồn kho lớn nhất: ");
                    LargestInventory(product);
                    break;
                case 5:
                    System.out.println("tổng số sản phẩm: " + countProduct(product) + ", tổng giá trị tồn kho: " +
                            totalInventoryValue(product) + ", giá trung bình: " + Product.getAveragePrice(product));
                    break;
                case 6:
                    System.out.println("Thay đổi tên kho: ");
                    Product.setStoreName("Kho miền Nam");
                    extracted(product);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void extracted(Product[] product) {
        for (int i = 0; i < product.length; i++) {
            product[i].display();
        }
    }

    public static String findName(Product arr[], String ProductName) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(ProductName)) {
                arr[i].display();
            }
        }
        return null;
    }

    public static void displayProduct(Product arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() > 1000000) {
                arr[i].display();
            }
        }
    }

    public static void LargestInventory(Product arr[]) {
        int max = arr[0].getQuantity();
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getQuantity()) {
                max = arr[i].getQuantity();
                arr[i].display();
            }
        }
    }

    public static int countProduct(Product arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    public static double totalInventoryValue(Product arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getInventoryValue();
        }
        return total;
    }

}