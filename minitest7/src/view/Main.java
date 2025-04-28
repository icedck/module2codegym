package view;

import controller.OrderManager;
import model.ClothingOrder;
import model.ElectronicsOrder;
import model.Size;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderManager om = new OrderManager();
//        om.addOrder(new ElectronicsOrder("EO1", "Quat", 20191230, 300000, 6));
//        om.addOrder(new ElectronicsOrder("EO2", "TV", 20230101, 3000000, 12));
//        om.addOrder(new ClothingOrder("CL1", "Ao thun", 20200703, 300000, "X"));
//        om.addOrder(new ClothingOrder("CL2", "Quan dui", 20210302, 200000, Size.S));

//        om.removeOrder("a");
//        om.removeOrder("b");
//        om.displayAllOrders();

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            System.out.println("================================");
            System.out.println("Menu");
            System.out.println("1. Thêm đơn hàng mới (Điện tử / Quần áo)");
            System.out.println("2. Xoá đơn hàng theo mã");
            System.out.println("3. Hiển thị tất cả đơn hàng");
            System.out.println("4. Hiển thị báo cáo doanh thu");
            System.out.println("5. Sắp xếp theo ngày đặt hàng");
            System.out.println("6. Sắp xếp theo tên khách hàng");
            System.out.println("7. Sắp xếp theo tổng tiền đơn hàng");
            System.out.println("8. Xem lịch sử thao tác");
            System.out.println("0. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    int choiceAddOrder = -1;
                    while (choiceAddOrder != 1 && choiceAddOrder != 2) {
                        System.out.println("1. Electronics Order");
                        System.out.println("2. Clothing Order");
                        System.out.print("Enter your choice: ");
                        choiceAddOrder = sc.nextInt();
                        sc.nextLine();

                        switch (choiceAddOrder) {
                            case 1:
                                om.addOrder(addElectronicsOrder(sc));
                                break;
                            case 2:
                                om.addOrder(addClothingOrder(sc));
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                    break;
                case 2:
                    String idRemove = getInputString(sc, "Nhap ID hang can xoa: ");
                    om.removeOrder(idRemove);
                    break;
                case 3:
                    om.displayAllOrders();
                    break;
                case 4:
                    om.displayRevenueReport();
                    break;
                case 5:
                    om.sortByOrderDate();
                    break;
                case 6:
                    om.sortByCustomerName();
                    break;
                case 7:
                    om.sortByTotalPrice();
                    break;
                case 8:
                    om.printHistory();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static ClothingOrder addClothingOrder(Scanner sc) {
        String id = getInputString(sc, "Nhap ID: ");
        String name = getInputString(sc, "Nhap ten: ");
        int date = getInputDateInt(sc, "Nhap ngay dat hang (yyyymmdd): ");
        double priceBase = getInputDouble(sc,"Nhap gia co ban: ");
        String size = getInputSize(sc, "Nhap size: ");
        return new ClothingOrder(id, name, date, priceBase, size);
    }

    private static ElectronicsOrder addElectronicsOrder(Scanner sc) {
        String id = getInputString(sc, "Nhap ID: ");
        String name = getInputString(sc, "Nhap ten: ");
        int date = getInputDateInt(sc, "Nhap ngay dat hang (yyyymmdd): ");
        double price = getInputDouble(sc, "Nhap gia hang: ");
        int month = getInputInt(sc, "Nhap thang bao hanh: ");
        return new ElectronicsOrder(id, name, date, price, month);
    }

    public static String getInputString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.nextLine();
        while (input.trim().isEmpty()) {
            System.out.println("Khong duoc de trong, hay nhap lai: ");
            System.out.print(prompt);
            input = sc.nextLine();
        }
        return input;
    }

    public static String getInputSize(Scanner sc, String prompt) {
        while (true){
            System.out.print(prompt);
            String input = sc.nextLine().trim().toUpperCase();
            if (input.isEmpty()){
                System.out.println("Khong duoc de trong, hay nhap lai: ");
                continue;
            }
            if(input.equals("S")||input.equals("M")||input.equals("L")||input.equals("XL")||input.equals("XXL")){
                return input;
            }else {
                System.out.println("Size khong hop le, chi chap nhan: S, M, L, XL, XXL, hay nhap lai: ");
            }
        }
    }

    public static int getInputInt(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String input = sc.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Khong duoc de trong, hay nhap lai: ");
                    continue;
                }
                return Integer.parseInt(input);
            }catch (NumberFormatException e) {
                System.out.println("Khong dung dinh dang so nguyen, hay nhap lai: ");
            }
        }
    }

    public static double getInputDouble(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String input = sc.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Khong duoc de trong, hay nhap lai: ");
                    continue;
                }
                return Double.parseDouble(input);
            }catch (NumberFormatException e) {
                System.out.println("Khong dung dinh danh so thuc, hay nhap lai: ");
            }
        }
    }

    public static int getInputDateInt(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                String input = sc.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Khong duoc de trong, hay nhap lai: ");
                    continue;
                }
                if (input.length() != 8){
                    System.out.println("Ngay phai du 8 chu so (yyyymmdd), hay nhap lai: ");
                    continue;
                }
                return Integer.parseInt(input);
            }catch (NumberFormatException e) {
                System.out.println("Khong dung dinh dang so nguyen, hay nhap lai: ");
            }
        }
    }
}