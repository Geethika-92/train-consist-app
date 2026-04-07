import java.util.*;

public class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== UC3: Unique Bogie IDs (HashSet) ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nBogie IDs after adding:");
        System.out.println(bogieIds);
    }
}