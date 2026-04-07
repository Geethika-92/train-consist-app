import java.util.*;

public class TrainAppUC7 {

    public static void main(String[] args) {

        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // ADD bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // SORT using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by capacity):");
        System.out.println(bogies);
    }
}
// UC7 PR change