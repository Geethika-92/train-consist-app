import java.util.regex.*;

public class TrainAppUC11 {

    public static void main(String[] args) {

        System.out.println("=== UC11: Regex Validation ===");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Validate using matches()
        boolean isTrainValid = m1.matches();
        boolean isCargoValid = m2.matches();

        // Output
        System.out.println("\nTrain ID: " + trainId);
        System.out.println("Valid Train ID? " + isTrainValid);

        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Valid Cargo Code? " + isCargoValid);

        // Try invalid inputs also
        String invalidTrain = "TRAIN12";
        String invalidCargo = "PET-ab";

        System.out.println("\nInvalid Train ID: " + invalidTrain +
                " → " + Pattern.matches(trainPattern, invalidTrain));

        System.out.println("Invalid Cargo Code: " + invalidCargo +
                " → " + Pattern.matches(cargoPattern, invalidCargo));
    }
}