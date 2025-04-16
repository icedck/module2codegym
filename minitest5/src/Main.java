import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MaterialManagement manager = new MaterialManagement();
//        for (int i = 1; i <= 5; i++) {
//            manager.addMaterial(new CrispyFlour("CF" + i, "Bột Chiên Giòn " + i, LocalDate.now().minusMonths(i+5), 10000, i * 2));
//        }
//        for (int i = 1; i <= 5; i++) {
//            manager.addMaterial(new Meat("M" + i, "Thịt " + i, LocalDate.now().minusDays(i+2), 80000, 1.5 * i));
//        }

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

        manager.displayMaterials();
//        manager.updateMaterial("M1", new CrispyFlour("CF6", "Bot chien gion 6", LocalDate.now().minusDays(5), 10000, 5));
//        manager.displayMaterials();
//        manager.deleteMaterial("CF1");
//        manager.displayMaterials();

        System.out.println("Chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay: " + manager.getDiscountDifference());
    }
}