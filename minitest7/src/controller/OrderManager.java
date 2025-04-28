package controller;

import model.CustomerNameComparator;
import model.Order;
import model.TotalPriceComparator;
import storage.OrderStorage;

import java.io.*;
import java.util.*;

public class OrderManager {
    static ArrayList<Order> orders = OrderStorage.getOrders();
    static LinkedList<String> history = new LinkedList<>();

    public void addOrder(Order o) {
        for (Order order : orders) {
            if (order.getOrderId().equals(o.getOrderId())) {
                System.out.println("Order already exists");
                return;
            }
        }
        orders.add(o);
        history.add("Da them " + o.getOrderId());
        OrderStorage.setOrders(orders);
    }

    public void removeOrder(String orderId) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderId().equals(orderId)) {
                orders.remove(i);
                history.add("Da xoa " + orderId);
                System.out.println("Xoa thanh cong order: " + orderId);
                OrderStorage.setOrders(orders);
                return;
            }
        }
        System.out.println("Khong tim thay ID: " + orderId);
    }

    public void displayAllOrders() {
        for (Order o : orders) {
            o.displayInfo();
        }
    }

    public void displayRevenueReport() {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.getOrderId() + ", Total Price: " + o.calculateTotalPrice());
        }
    }

    public void sortByOrderDate() {
        Collections.sort(orders);
        history.add("da sap xep theo ngay");
        OrderStorage.setOrders(orders);
    }

    public void sortByCustomerName() {
        orders.sort(new CustomerNameComparator());
        history.add("da sap xep theo ten");
        OrderStorage.setOrders(orders);
    }

    public void sortByTotalPrice() {
        orders.sort(new TotalPriceComparator());
        history.add("da sap xep theo tong tien");
        OrderStorage.setOrders(orders);
    }

    public void printHistory() {
        for (String s : history) {
            System.out.println(s);
        }
    }

//    public void saveToFile(String filename) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
//            oos.writeObject(orders);
//            history.add("Da luu orders vao file: " + filename);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public void loadFromFile(String filename) {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
//            orders = (ArrayList<Order>) ois.readObject();
//            history.add("Doc orders tu file " + filename);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
}
