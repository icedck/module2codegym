import java.util.ArrayList;
import java.util.Collections;

public class ProductManagerArrayList {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        for (Product p1 : products) {
            if (p1.getID().equals(p.getID())) {
                System.out.println("Product already exists!");
                return;
            }
        }
        products.add(p);
    }

    public void updateProduct(String id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID().equals(id)) {
                products.set(i, product);
                return;
            }
        }
        System.out.println("Product does not exist!");
    }

    public void removeProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID().equals(id)){
                products.remove(i);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void displayProducts() {
        for (Product p : products) {
            p.displayProduct();
        }
    }

    public void findProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                p.displayProduct();
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void sortProducts() {
        Collections.sort(products);
    }

    public void reverseSortProducts() {
        products.sort(Collections.reverseOrder());
    }
}
