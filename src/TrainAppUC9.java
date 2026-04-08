import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String id;
    String type;
    int capacity;

    public Bogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("ID: " + id + ", Type: " + type + ", Capacity: " + capacity);
    }
}

public class TrainAppUC9 {
    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", "Sleeper", 50));
        bogies.add(new Bogie("B2", "AC Chair", 72));
        bogies.add(new Bogie("B3", "First Class", 80));
        bogies.add(new Bogie("B4", "Sleeper", 60));
        bogies.add(new Bogie("B5", "AC Chair", 90));

        // Step 2: Group using groupingBy()
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.getType()));

        // Step 3: Display result
        System.out.println("=== Grouped Bogies ===");

        for (String key : grouped.keySet()) {
            System.out.println("\nType: " + key);

            for (Bogie b : grouped.get(key)) {
                b.display();
            }
        }
    }
}
// final submission PR