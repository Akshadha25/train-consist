import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create bogie list (try empty and non-empty)
        List<String> bogies = new ArrayList<>();

        // Uncomment to test valid case
        // bogies.add("BG101");
        // bogies.add("BG205");

        String searchKey = "BG101";

        try {
            // Step 2: Defensive check
            if (bogies.isEmpty()) {
                throw new IllegalStateException("Cannot perform search: Train has no bogies.");
            }

            // Step 3: Search logic (Linear Search)
            boolean found = false;

            for (String id : bogies) {
                if (id.equals(searchKey)) {
                    System.out.println("\nBogie Found: " + id);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nBogie NOT Found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
