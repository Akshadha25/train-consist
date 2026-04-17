import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Step 2: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacities
                .reduce(0, Integer::sum);      // sum them

        // Step 3: Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        System.out.println("\nProgram continues...");
    }
}
