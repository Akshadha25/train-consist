import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashMap
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Step 3: Display mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}
