import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogies));

        // Step 2: Use built-in sort
        Arrays.sort(bogies);

        // Step 3: Display sorted array
        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nProgram continues...");
    }
}
