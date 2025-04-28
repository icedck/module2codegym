package model;

import java.io.Serializable;

public class ElectronicsOrder extends Order implements Serializable {
    private double itemPrice;
    private int warrantyMonths;

    public ElectronicsOrder() {
    }

    public ElectronicsOrder(double itemPrice, int warrantyMonths) {
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicsOrder(String orderId, String customerName, int orderDate, double itemPrice, int warrantyMonths) {
        super(orderId, customerName, orderDate);
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics : " + getOrderId() + ", " + getCustomerName() + ", " + getOrderDate() + ", Item price: " + itemPrice + ", Warranty Months: " + warrantyMonths);
    }

    @Override
    public String toString() {
        return "ElectronicsOrder{" +
                "itemPrice=" + itemPrice +
                ", warrantyMonths=" + warrantyMonths +
                '}';
    }

    @Override
    public double calculateTotalPrice() {
        return itemPrice + warrantyMonths * 50;
    }
}
