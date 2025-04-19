import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class VehicleManager {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    LinkedList<String> history = new LinkedList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        history.add("Da them xe co ID: " + v.getId());
    }

    public void removeVehicle(String id) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId().equals(id)) {
                vehicles.remove(i);
                history.add("Da xoa xe co ID: " + id);
                return;
            }
        }
    }

    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }

    public void displayTax() {
        for (Vehicle v : vehicles) {
            System.out.println("ID: " + v.getId() + ", Tax: " + v.calculateTax());
        }
    }

    public void sortByYear(){
        Collections.sort(vehicles);
        history.add("Da sap xep xe theo nam");
    }

    public void sortByBrand(){
        vehicles.sort(new CompareBrands());
        history.add("Da sap xep xe theo brand");
    }

    public void sortByTax(){
        vehicles.sort(new CompareCalculateTax());
        history.add("Da sap xep xe theo thue");
    }

    public void printHistory(){
        for (String s : history) {
            System.out.println(s);
        }
    }
}
