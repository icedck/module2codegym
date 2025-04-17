import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getRealMoney() {
        LocalDate expiry = getExpiryDate();
        LocalDate now = LocalDate.now();
        int remainingDays = expiry.getDayOfYear() - now.getDayOfYear();
        if (remainingDays <= 5) {
            return getAmount() * 0.7;
        }else {
            return getAmount() * 0.9;
        }
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

}
