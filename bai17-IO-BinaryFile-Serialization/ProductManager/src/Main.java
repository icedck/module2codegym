import java.io.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Keo", 1000, "Hoang Ha", "good"));
        products.add(new Product(2, "Banh", 2000, "Hoang Ha", "good"));
        products.add(new Product(3, "Sua", 5000, "Hoang Ha", "good"));
        writeProductList("bai17-IO-BinaryFile-Serialization/ProductManager/src/products.txt", products);
        List<Product> productData = readProductList("bai17-IO-BinaryFile-Serialization/ProductManager/src/products.txt");
        for (Product product : productData) {
            System.out.println(product);
        }

        searchProductInFile("bai17-IO-BinaryFile-Serialization/ProductManager/src/products.txt", 1);
    }

    public static void writeProductList(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProductList(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void searchProductInFile(String path, int id) {
        List<Product> products = readProductList(path);

        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found");
        }
    }
}