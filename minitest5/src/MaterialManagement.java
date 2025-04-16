public class MaterialManagement {
    private Material[] materials;
    private int count;

    public MaterialManagement() {
        materials = new Material[10];
        count = 0;
    }

    private void expandArray() {
        if (count >= materials.length) {
            Material[] newMaterials = new Material[materials.length * 2];
            for (int i = 0; i < materials.length; i++) {
                newMaterials[i] = materials[i];
            }
            materials = newMaterials;
        }
    }

    public void addMaterial(Material material) {
        expandArray();
        materials[count++] = material;
    }

    public void updateMaterial(String id, Material material) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                materials[i] = material;
            }
            return;
        }
    }

    public void deleteMaterial(String id) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                for (int j = i; j < count-1; j++) {
                    materials[j] = materials[j+1];
                }
            }
            materials[count-1] = null;
            count--;
            return;
        }
    }

    public double getDiscountDifference() {
        double totalAmount = 0;
        double totalDiscount = 0;
        for (int i = 0; i < materials.length; i++) {
            totalAmount += materials[i].getAmount();
            if (materials[i] instanceof Discount){
                totalDiscount += ((Discount)materials[i]).getRealMoney();
            }
        }
        return totalAmount - totalDiscount;
    }

    public void displayMaterials() {
        for (int i = 0; i < count; i++) {
            Material material = materials[i];
            System.out.print("ID: " + material.getId()
                    + " | Name: " + material.getName()
                    + " | Amount: " + material.getAmount()
                    + " | Expiry: " + material.getExpiryDate()
                    + " | Cost: " + material.getCost());
            if (material instanceof Meat) {
                Meat meat = (Meat) material;
                System.out.print(" | Weight: " + meat.getWeight());
            }else{
                CrispyFlour flour = (CrispyFlour) material;
                System.out.print(" | Quantity: " + flour.getQuantity());
            }
            System.out.println();
        }
    }

}
