import java.util.*;

public class VehicleManager {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    LinkedList<String> history = new LinkedList<>();

    private void logHistory(String message) {
        this.history.add(String.format("[%tT] %s", new Date(), message));
    }

    public void addVehicle(Vehicle v) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(v.getId())) {
                System.out.println("Vehicle already exists");
                return;
            }
        }
        vehicles.add(v);
        logHistory("Da them xe co ID: " + v.getId());
    }

    public void removeVehicle(String id) {
        boolean found = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId().equals(id)) {
                vehicles.remove(i);
                logHistory("Da xoa xe co ID: " + id);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("khong tim thay ID xe: " + id);
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
        logHistory("Da sap xep xe theo nam");
    }

    public void sortByBrand(){
        vehicles.sort(new CompareBrands());
        logHistory("Da sap xep xe theo brand");
    }

    public void sortByTax(){
        vehicles.sort(new CompareCalculateTax());
        logHistory("Da sap xep xe theo thue");
    }

    public void printHistory(){
        for (String s : history) {
            System.out.println(s);
        }
    }
}
