import java.util.*;
public class TrainAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== UC5: LinkedHashSet (Ordered + Unique Bogies) ===");

        // Create LinkedHashSet
        Set<String> train = new LinkedHashSet<>();

        // ADD bogies (in order)
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper");

        // DISPLAY formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);
    }
}