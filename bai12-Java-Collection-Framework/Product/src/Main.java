//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManagerArrayList products = new ProductManagerArrayList();
        products.addProduct(new Product("A01", "Snack", 2, 5000));
        products.addProduct(new Product("A02", "Cake", 5, 500));
        products.addProduct(new Product("A03", "Candy", 10, 100));
        products.addProduct(new Product("A04", "Water", 3, 5000));

        products.displayProducts();
        System.out.println("find name");
        products.findProduct("Cake");
        System.out.println("Update product");
        products.updateProduct("A01", new Product("A06", "Milk", 5,3000));
        products.displayProducts();
        System.out.println("Delete product");
        products.removeProduct("A02");
        products.displayProducts();
        System.out.println("Sorted Products: ");
        products.sortProducts();
        products.displayProducts();
        System.out.println("Sorted Products 2: ");
        products.reverseSortProducts();
        products.displayProducts();
    }
}