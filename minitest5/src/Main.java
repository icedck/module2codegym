import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManagement manager = new MaterialManagement();
        manager.addMaterial(new CrispyFlour("CF1", "Bột 1", LocalDate.now().minusMonths(9), 1000, 2));
        manager.addMaterial(new CrispyFlour("CF2", "Bột 2", LocalDate.now().minusMonths(6), 1200, 3));
        manager.addMaterial(new CrispyFlour("CF3", "Bột 3", LocalDate.now().minusMonths(10), 800, 1));
        manager.addMaterial(new CrispyFlour("CF4", "Bột 4", LocalDate.now().minusMonths(11), 900, 4));
        manager.addMaterial(new CrispyFlour("CF5", "Bột 5", LocalDate.now().minusMonths(3), 1100, 2));

        manager.addMaterial(new Meat("M1", "Thịt 1", LocalDate.now().minusDays(2), 2000, 1.5));
        manager.addMaterial(new Meat("M2", "Thịt 2", LocalDate.now().minusDays(5), 2200, 2));
        manager.addMaterial(new Meat("M3", "Thịt 3", LocalDate.now().minusDays(6), 1800, 1));
        manager.addMaterial(new Meat("M4", "Thịt 4", LocalDate.now().minusDays(3), 2100, 1.2));
        manager.addMaterial(new Meat("M5", "Thịt 5", LocalDate.now().minusDays(1), 2500, 1.7));

        Scanner sc = new Scanner(System.in);

         int choice = -1;

         while (choice != 0) {
             System.out.println("Menu");
             System.out.println("1. Add Material");
             System.out.println("2. Update Material");
             System.out.println("3. Delete Material");
             System.out.println("4. Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay");
             System.out.println("0. Exit");
             System.out.println("Enter your choice: ");
             choice = sc.nextInt();

             switch (choice){
                 case 1:
                     int choiceAddMaterial = -1;
                     while (choiceAddMaterial != 1 && choiceAddMaterial != 2) {
                         System.out.println("1. Add CrispyFlour");
                         System.out.println("2. Add Meat");
                         System.out.println("3. Enter your choice: ");
                         choiceAddMaterial = sc.nextInt();
                         sc.nextLine();

                         System.out.println("Enter id of the material: ");
                         String id = sc.nextLine();

                         if (manager.checkIDMaterial(id)){
                             System.out.println("id already exist");
                             break;
                         }
                         switch (choiceAddMaterial){
                             case 1:
                                 CrispyFlour crispyFlour = addCrispyFlour(id, sc);
                                 manager.addMaterial(crispyFlour);
                                 System.out.println("Crispy flour added");
                                 manager.displayMaterials();
                                 break;
                             case 2:
                                 Meat meat = addMeat(id, sc);
                                 manager.addMaterial(meat);
                                 System.out.println("Meat added");
                                 manager.displayMaterials();
                                 break;
                             default:
                                 System.out.println("Invalid choice");
                         }
                     }
                     break;
                 case 2:
                     int choiceUpdateMaterial = -1;
                     while (choiceUpdateMaterial != 1 && choiceUpdateMaterial != 2) {
                         System.out.println("1. Update CrispyFlour");
                         System.out.println("2. Update Meat");
                         System.out.println("3. Enter your choice: ");
                         choiceUpdateMaterial = sc.nextInt();
                         sc.nextLine();

                         switch (choiceUpdateMaterial){
                             case 1:
                                 System.out.println("Enter CrispyFlour ID to update: ");
                                 String idCrispyFlour = sc.nextLine();
                                 if (!manager.checkIDMaterial(idCrispyFlour)){
                                     System.out.println("ID already exist");
                                 }else {
                                     manager.updateMaterial(idCrispyFlour, addCrispyFlour(idCrispyFlour, sc));
                                     System.out.println("Crispy flour updated");
                                     manager.displayMaterials();
                                 }
                                 break;
                             case 2:
                                 System.out.println("Enter Meat ID to update: ");
                                 String idMeat = sc.nextLine();
                                 if (!manager.checkIDMaterial(idMeat)){
                                     System.out.println("ID already exist");
                                 }else {
                                     manager.updateMaterial(idMeat, addMeat(idMeat, sc));
                                     System.out.println("Meat updated");
                                     manager.displayMaterials();
                                 }
                                 break;
                             default:
                                 System.out.println("Invalid choice");
                         }
                     }
                     break;
                 case 3:
                     sc.nextLine();
                     System.out.println("Enter ID of the material to delete: ");
                     String id = sc.nextLine();

                     System.out.println("Do u really want to delete? (y/n)");
                     String choiceDelete = sc.next();
                     if (choiceDelete.equals("y")){
                         manager.deleteMaterial(id);
                     }else {
                         System.out.println("Request canceled");
                         break;
                     }
                     manager.displayMaterials();
                     break;
                 case 4:
                     manager.getDiscountDifference();
                     break;
                 case 0:
                     System.exit(0);
                 default:
                     System.out.println("Invalid choice");
             }
         }
    }


    public static CrispyFlour addCrispyFlour(String id, Scanner sc) {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter number of months deducted: ");
        int months = sc.nextInt();
        System.out.println("Enter cost: ");
        int cost = sc.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        return new CrispyFlour(id, name, LocalDate.now().minusMonths(months), cost, quantity);
    }

    public static Meat addMeat(String id, Scanner sc) {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter number of days deducted: ");
        int days = sc.nextInt();
        System.out.println("Enter cost: ");
        int cost = sc.nextInt();
        System.out.println("Enter weight: ");
        double weight = sc.nextInt();

        return new Meat(id, name, LocalDate.now().minusMonths(days), cost, weight);
    }
}