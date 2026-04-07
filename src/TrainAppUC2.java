import java.util.*;

public class TrainAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== UC2: Passenger Bogie Management ===");

        // Create ArrayList
        List<String> bogies = new ArrayList<>();

        // ADD bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(bogies);

        // REMOVE one bogie
        bogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(bogies);

        // CHECK existence
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present");
        }

        // FINAL LIST
        System.out.println("\nFinal Bogie List:");
        System.out.println(bogies);
    }
}