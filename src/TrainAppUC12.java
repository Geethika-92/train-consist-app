import java.util.*;

public class TrainAppUC12 {

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));

        // Try invalid case also
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        System.out.println(bogies);

        // SAFETY CHECK using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output result
        System.out.println("\nIs Train Safe? " + isSafe);
    }
}