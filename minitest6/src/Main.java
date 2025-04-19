import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleManager vm = new VehicleManager();
        vm.addVehicle(new Car("C01", "bmw", 2019, 4));
        vm.addVehicle(new Car("C02", "audi", 2020, 4));
        vm.addVehicle(new Car("C03", "toyota", 2018, 7));
        vm.addVehicle(new Motorbike("M01", "wave", 2021, 70));
        vm.addVehicle(new Motorbike("M02", "AB", 2016, 180));
        vm.addVehicle(new Motorbike("M03", "SH", 2022, 190));

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Xoá phương tiện theo mã");
            System.out.println("3. Hiển thị danh sách phương tiện");
            System.out.println("4. Hiển thị báo cáo thuế");
            System.out.println("5. Sắp xếp theo năm sản xuất");
            System.out.println("6. Sắp xếp theo hãng sản xuất");
            System.out.println("7. Sắp xếp theo thuế tăng dần");
            System.out.println("8. Xem lịch sử thao tác");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhap kieu xe (car || motorbike): ");
                    String type = sc.nextLine();
                    System.out.println("Nhap ID: ");
                    String id = sc.nextLine();
                    System.out.println("Nhap Brand: ");
                    String brand = sc.nextLine();
                    System.out.println("Nhap Year: ");
                    int year = sc.nextInt();

                    if (type.equalsIgnoreCase("car")){
                        System.out.println("Nhap so luong cho ngoi: ");
                        int seat = sc.nextInt();
                        vm.addVehicle(new Car(id, brand, year, seat));
                    }
                    if (type.equalsIgnoreCase("motorbike")){
                        System.out.println("Nhap cong suat dong co: ");
                        int power = sc.nextInt();
                        vm.addVehicle(new Motorbike(id, brand, year, power));
                    }
                    break;
                case 2:
                    System.out.println("Nhap xe can xoa theo ID: ");
                    String idRemove = sc.nextLine();
                    vm.removeVehicle(idRemove);
                    break;
                case 3:
                    vm.displayVehicles();
                    break;
                case 4:
                    vm.displayTax();
                    break;
                case 5:
                    vm.sortByYear();
                    break;
                case 6:
                    vm.sortByBrand();
                    break;
                case 7:
                    vm.sortByTax();
                    break;
                case 8:
                    vm.printHistory();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}