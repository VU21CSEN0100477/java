import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] meds = new Medicine[4];

        // Loop 4 times to read input
        for (int i = 0; i < meds.length; i++) 
        {
            int id = sc.nextInt();
            String name = sc.next();
            String type = sc.next();
            double price = sc.nextDouble();   

            
            // Create the object and put it in the array
            meds[i] = new Medicine(id, name, type, price);
        }
        // Read the search name (the last line of input)
        String search = sc.next();

        // Call the static method
        int count = countMedicinesByMedicineName(meds, search);

        // Print the result based on requirements
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No medicines found with that name");
        }
        
        sc.close(); 
    }

    // FIXED: Changed 'void' to 'int' because we return a number
    public static int countMedicinesByMedicineName(Medicine[] medicines, String searchName) {
        int count = 0;

        for (int i = 0; i < medicines.length; i++) {
            if (medicines[i].getMedicineName().equalsIgnoreCase(searchName)) {
                count++;
            }
        }
        return count;
    }
}

// FIXED: Removed 'public'. Only Solution should be public.
class Medicine {
    private int MedicineId;
    private String MedicineName;
    private String MedicineType;
    private double price;

    // Constructor
    public Medicine(int MedicineId, String MedicineName, String MedicineType, double price) {
        this.MedicineId = MedicineId;
        this.MedicineName = MedicineName;
        this.MedicineType = MedicineType;
        this.price = price;
    }

    // Getters and Setters
    public int getMedicineId() { return MedicineId; }
    public void setMedicineId(int MedicineId) { this.MedicineId = MedicineId; }

    public String getMedicineName() { return MedicineName; }
    public void setMedicineName(String MedicineName) { this.MedicineName = MedicineName; }

    public String getMedicineType() { return MedicineType; }
    public void setMedicineType(String MedicineType) { 
        this.MedicineType = MedicineType; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}