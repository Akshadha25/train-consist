import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Try adding duplicate
        train.add("Sleeper"); // duplicate (ignored)

        // Step 4: Display formation
        System.out.println("\nFinal Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Bogies: " + train.size());

        System.out.println("\nProgram continues...");
    }
}
