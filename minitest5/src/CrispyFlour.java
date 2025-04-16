import java.io.Serializable;
import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getRealMoney() {
        LocalDate expiry = getManufacturingDate();
        LocalDate now = LocalDate.now();
        int remainingDays = expiry.getMonthValue() - now.getMonthValue();
        if (remainingDays <= 2) {
            return getAmount() * 0.6;
        }else if (remainingDays <= 4) {
            return getAmount() * 0.8;
        }else {
            return getAmount() * 0.95;
        }
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

}
