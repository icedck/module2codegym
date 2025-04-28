package storage;

import model.ClothingOrder;
import model.ElectronicsOrder;
import model.Order;

import java.io.*;
import java.util.ArrayList;

public class OrderStorage {
    private static ArrayList<Order> orders = new ArrayList<Order>();

    public static ArrayList<Order> getOrders() {
        File file = new File("orders.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            orders = (ArrayList<Order>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Chưa có file dữ liệu orders.txt, khởi tạo danh sách rỗng.");
            orders = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public static void setOrders(ArrayList<Order> orders) {
        OrderStorage.orders = orders;
        File file = new File("orders.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(orders);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//
//        ArrayList<Order> newOrders = new ArrayList<>();
//        newOrders.add(new ClothingOrder("a", "Shirt", 2, 20.0, "M")); // Requires a constructor in ClothingOrder
//        newOrders.add(new ElectronicsOrder("b", "Laptop", 1, 1000.0, 2)); //Requires a constructor in ElectronicsOrder
//
//        setOrders(newOrders);
//
//        ArrayList<Order> retrievedOrdersAgain = getOrders();
//        System.out.println("Retrieved orders after setting: " + retrievedOrdersAgain);
//
//    }
}
