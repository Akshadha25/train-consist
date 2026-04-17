import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101"); // duplicate
        bogieIDs.add("B102"); // duplicate

        // Step 3: Display unique bogies
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // Step 4: Show total unique count
        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());

        System.out.println("\nProgram continues...");
    }
}
