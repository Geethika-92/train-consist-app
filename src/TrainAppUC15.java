public class TrainAppUC15 {
}
// Custom runtime exception for unsafe cargo
class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

// GoodsBogie class with cargo assignment
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        try {
            // Safety check: Petroleum cannot go into Rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo: Petroleum cannot be assigned to Rectangular bogie.");
            }
            // If safe, assign cargo
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo + " to " + shape + " bogie.");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
        }
    }

    @Override
    public String toString() {
        return shape + " bogie carrying " + (cargo == null ? "no cargo" : cargo);
    }
}

// Main class to test UC15
public class TrainConsistAppUC15 {
    public static void main(String[] args) {
        // Create goods bogies
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Unsafe assignment
        rectangular.assignCargo("Petroleum");

        // Assign safe cargo to rectangular
        rectangular.assignCargo("Coal");

        // Print final bogie states
        System.out.println(cylindrical);
        System.out.println(rectangular);
    }
}