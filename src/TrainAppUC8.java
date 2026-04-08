import java.util.*;
import java.util.stream.Collectors;

// Base Class
class Bogie {
    private String id;
    protected int capacity;

    public Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getId() {
        return id;
    }

    public void display() {
        System.out.println("Bogie ID: " + id + ", Capacity: " + capacity);
    }
}

// Passenger Bogie Class
class PassengerBogie extends Bogie {
    private String type;

    public PassengerBogie(String id, int capacity, String type) {
        super(id, capacity);
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Passenger Bogie -> ID: " + getId()
                + ", Type: " + type
                + ", Capacity: " + capacity);
    }
}

// Main Class (UC8)
public class TrainAppUC8 {
    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse UC7 style)
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("B1", 50, "Sleeper"));
        bogies.add(new PassengerBogie("B2", 72, "AC Chair"));
        bogies.add(new PassengerBogie("B3", 80, "First Class"));
        bogies.add(new PassengerBogie("B4", 60, "Sleeper"));
        bogies.add(new PassengerBogie("B5", 90, "AC Chair"));

        // Step 2: Display original list
        System.out.println("=== Original Bogies ===");
        bogies.forEach(Bogie::display);

        // Step 3: Apply Stream filter (UC8 main logic)
        List<PassengerBogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)   // Condition
                .collect(Collectors.toList());

        // Step 4: Display filtered result
        System.out.println("\n=== Filtered Bogies (Capacity > 60) ===");

        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies matched the condition.");
        } else {
            filteredBogies.forEach(Bogie::display);
        }

        // Step 5: Verify original list unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}