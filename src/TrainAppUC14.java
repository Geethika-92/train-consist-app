import java.util.ArrayList;
import java.util.List;

// Custom exception for invalid bogie capacity
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger bogie class with capacity validation
class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}

// Main application
public class TrainConsistApp {
    public static void main(String[] args) {
        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            bogies.add(sleeper);

            PassengerBogie acChair = new PassengerBogie("AC Chair", 56);
            bogies.add(acChair);

            // Invalid bogie (will throw exception)
            PassengerBogie firstClass = new PassengerBogie("First Class", 0);
            bogies.add(firstClass);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display all valid bogies
        System.out.println("Current Train Bogies:");
        for (PassengerBogie bogie : bogies) {
            System.out.println(bogie);
        }
    }
}