package model;

import java.io.Serializable;

public class ClothingOrder extends Order implements Serializable {
    private double basePrice;
    private String size;

    public ClothingOrder() {
    }

    public ClothingOrder(double basePrice, String size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public ClothingOrder(String orderId, String customerName, int orderDate, double basePrice, String size) {
        super(orderId, customerName, orderDate);
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics : " + getOrderId() + ", " + getCustomerName() + ", " + getOrderDate() + ", Base Price: " + basePrice + ", Size: " + size);
    }

    @Override
    public String toString() {
        return "ClothingOrder{" +
                "basePrice=" + basePrice +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public double calculateTotalPrice() {
        if (size.equalsIgnoreCase("L")||size.equalsIgnoreCase("XL")) {
            return basePrice * 1.1;
        }
        return basePrice;
    }
}
