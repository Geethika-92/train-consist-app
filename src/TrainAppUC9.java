import java.util.*;
import java.util.stream.*;

public class TrainAppUC9 {

    public static void main(String[] args) {

        System.out.println("=== UC9: Group Bogies by Type ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // Print original list
        System.out.println("\nOriginal List:");
        System.out.println(bogies);

        // Group using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Print grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
// final submission PR
// PR TEST CHANGE
// FINAL PR UC12