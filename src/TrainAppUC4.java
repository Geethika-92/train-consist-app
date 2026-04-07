import java.util.*;

public class TrainAppUC4 {

    public static void main(String[] args) {

        System.out.println("=== UC4: Train Consist using LinkedList ===");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train:");
        System.out.println(train);

        train.add(1, "Pantry");

        System.out.println("\nAfter Adding Pantry:");
        System.out.println(train);

        train.removeFirst();
        train.removeLast();

        System.out.println("\nFinal Train:");
        System.out.println(train);
    }
}
// final PR