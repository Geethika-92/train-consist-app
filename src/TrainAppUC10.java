import java.util.*;
        import java.util.stream.*;

public class TrainAppUC10 {

    public static void main(String[] args) {

        System.out.println("=== UC10: Total Seating Capacity ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Display bogies
        System.out.println("\nBogies:");
        System.out.println(bogies);

        // CALCULATE TOTAL using map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // sum all

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}